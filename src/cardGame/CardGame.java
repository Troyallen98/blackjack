package cardGame;

import java.util.*;

public class CardGame {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        List<String> cardDeck = cardGame.makeDeckOfCards();
        Deque<String> shuffledCards = cardGame.shuffleCards(cardDeck);
        int numberOfPlayers = 2;


        cardGame.dealHands(numberOfPlayers, shuffledCards, 2);
        System.out.println(cardGame.dealHands(numberOfPlayers, shuffledCards, 2));
    }

    private Deque<String> shuffleCards(List<String> cardDeck) {
        Deque<String> shuffledDeck = new ArrayDeque<>();
        int randomNextInt;

        for (int i = cardDeck.size(); i > 0; i--) {
            randomNextInt = RANDOM.nextInt(cardDeck.size());
            shuffledDeck.add(cardDeck.get(randomNextInt));
            cardDeck.remove(randomNextInt);
        }
        System.out.println("shuffledDeck = " + shuffledDeck);
        return shuffledDeck;
    }


    private Map<Integer, List<String>> dealHands(int amountOfPlayers, Deque<String> cardDeck, int cardsPerHand) {
        //TODO if amount of players * amount per player exceeds deck count it will throw a bounds exception

        Map<Integer, List<String>> playerHands = new HashMap<>();
        int maximumAmountOfHits = 5;
        int amountOfCardsForGame = amountOfPlayers * (cardsPerHand + maximumAmountOfHits);
        int amountOfDecksForGame = amountOfCardsForGame / 52;

        Deque<String> shoe = new ArrayDeque<>();
//
//        if (amountOfCardsForGame > cardDeck.size()) {
//            // how to merge multiple deques
//            while (shoe.size() < amountOfCardsForGame) {
//
//            }
//
//
//
//        }

        for (int currentPlayer = 0; currentPlayer < amountOfPlayers; currentPlayer++) {
            playerHands.put(currentPlayer, new ArrayList<>());
        }

        for (int i = 0; i < cardsPerHand; i++) {
            for (int currentPlayer = 0; currentPlayer < amountOfPlayers; currentPlayer++) {
                playerHands.get(currentPlayer).add(cardDeck.pop());
            }
        }

        return playerHands;

    }


    private ArrayList<String> makeDeckOfCards() {
        ArrayList<String> cards = new ArrayList<>();
        String[] suites = {
                "clubs",
                "diamonds",
                "spades",
                "hearts"
        };
        int suiteIndex = 0;

        for (int i = 1; i <= 14; i++) {
            if(i > 13) {
                i = 1;
                suiteIndex ++;
            }
            if (suiteIndex > 3) {
                break;
            }
            makeCard(suites[suiteIndex], cards, i);
        }
        return cards;
    }

    private void makeCard(String suite, ArrayList<String> cards, int cardIndex) {
        if (suite.equalsIgnoreCase("clubs") || suite.equalsIgnoreCase("diamonds") || suite.equalsIgnoreCase("hearts") || suite.equalsIgnoreCase("spades")) {
            if (cardIndex > 1 && cardIndex < 11) {
                cards.add(cardIndex + suite);
            } else {
                makeFaceCard(cards, cardIndex, suite);
            }
        }
    }

    private void makeFaceCard(ArrayList<String> cards, int cardIndex, String suite) {
        switch (cardIndex) {
            case 1 -> cards.add("A" + suite);
            case 11 -> cards.add("J" + suite);
            case 12 -> cards.add("Q" + suite);
            case 13 -> cards.add("K" + suite);
            default -> System.out.println("Not a Valid card");
        }
    }
}
