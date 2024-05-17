package blackjack.services;

import blackjack.Card;
import blackjack.Game;
import blackjack.Hand;

import java.util.List;
import java.util.Scanner;

public class GameService {

    private DeckService deckService;
    private PlayerService playerService;
    private final DealerService dealerService;
    private static final String DEALER_MESSAGE = "        Dealers Hand: ";

    public GameService() {
        deckService = new DeckService();
        playerService = new PlayerService("Player");
        dealerService = new DealerService();
    }

    public void start() {
        System.out.println("=========================");
        System.out.println("| Welcome to Blackjack! |");
        System.out.println("=========================");

        // Shuffle cards
        deckService.shuffle();

        // Accept bets
        playerService.placeBet();

        // Deal initial cards
        dealerService.dealInitialCards(deckService, playerService);

        // Shows hands
        showHands();

        // Player's turn
        playerTurn();

        // Dealer's turn
        dealerTurn();

    }

    public void playAgain() {
        if (playerService.getMoneyInPossession() > 0) {
            betAgain();
        } else {
            System.out.println("YOU SUCKKKK!!!!");
            Game game = new Game();
            game.start();
        }

    }

    private void betAgain() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.print("Would you like to bet again?: (Y)es or (N)o: ");
        choice = scanner.nextLine().trim().toLowerCase();

        if ("y".equalsIgnoreCase(choice)) {
            deckService = new DeckService();
            playerService = new PlayerService("Player", playerService.getMoneyInPossession());

            start();
        }
    }

    public void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.print("Choose an action: (H)it or (S)tand: ");
            choice = scanner.nextLine().trim().toLowerCase();

            if ("h".equals(choice)) {
                Card card = deckService.dealCard();
                playerService.addCardToHand(card);
                showHands();
                if (playerService.getHand().is21() || playerService.getHand().isBusted()) {
                    determineWinner();
                }
            } else if ("s".equals(choice)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void dealerTurn() {
        if (!playerService.getHand().isBusted()) {
            dealerService.playTurn(deckService);
        }
        determineWinner();
    }

    public void determineWinner() {
        int playerValue = playerService.getHand().calculateValue();
        int dealerValue = dealerService.getHand().calculateValue();

        if (playerService.getHand().is21() ) {
            System.out.println("You win!" + DEALER_MESSAGE + getDealerfullHandString(dealerService));
            playerService.setMoneyInPossession(playerService.getMoneyInPossession() + playerService.getBet() * 2);
        } else if (playerService.getHand().isBusted()) {
            System.out.println("You lose. Busted!" + DEALER_MESSAGE + getDealerfullHandString(dealerService));
        } else if (dealerService.getHand().isBusted()) {
            System.out.println("Dealer busts. You win!" + DEALER_MESSAGE + getDealerfullHandString(dealerService));
            playerService.setMoneyInPossession(playerService.getMoneyInPossession() + playerService.getBet() * 2);
        } else if (playerValue > dealerValue) {
            System.out.println("You win!" + DEALER_MESSAGE + getDealerfullHandString(dealerService));
            playerService.setMoneyInPossession(playerService.getMoneyInPossession() + playerService.getBet() * 2);
        } else if (playerValue < dealerValue) {
            System.out.println("You lose." + DEALER_MESSAGE + getDealerfullHandString(dealerService));
        } else {
            System.out.println("It's a tie!");
            playerService.setMoneyInPossession(playerService.getMoneyInPossession() + playerService.getBet());
        }

        reset();
    }

    public String getDealerfullHandString(DealerService dealer) {
        return getHand(dealer.getHand());
    }

    public String getHand(Hand hand) {
        List<Card> cards = hand.getCards();
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.rank()).append(card.getFormattedSuit()).append(" ");
        }

        sb.append(" (Value: ").append(hand.calculateValue()).append(")");

        return sb.toString();
    }

    public void showHands() {
        System.out.println("Player's hand: " + getPlayerHandString(playerService));
        System.out.println("Dealer's hand: " + getDealerHiddenHandString(dealerService));

        if (playerService.getHand().is21()) {
            determineWinner();
        }
    }

    public String getDealerHiddenHandString(DealerService dealer) {
        List<Card> cards = dealer.getHand().getCards();
        StringBuilder sb = new StringBuilder();

        if (!cards.isEmpty()) {
            sb.append(cards.get(0).rank()).append(cards.get(0).getFormattedSuit()).append(" [FaceDown]");
        }

        return sb.toString();
    }

    public String getPlayerHandString(PlayerService player) {
        return getHand(player.getHand());
    }

    public void reset() {
        playerService.getHand().clear();
        dealerService.getHand().clear();

        // Play again?
        playAgain();
    }

}
