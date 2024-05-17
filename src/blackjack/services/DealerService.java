package blackjack.services;

import blackjack.Card;
import blackjack.Hand;

public class DealerService {
    private final Hand hand;

    public DealerService() {
        hand = new Hand();
    }

    public void dealInitialCards(DeckService deck, PlayerService player) {

        Card card1 = deck.dealCard();
        Card card2 = deck.dealCard();

        player.getHand().addCard(card1);
        player.getHand().addCard(card2);

        Card dealerCard1 = deck.dealCard();
        Card dealerCard2 = deck.dealCard();

        hand.addCard(dealerCard1);
        hand.addCard(dealerCard2);
    }

    public void playTurn(DeckService deck) {
        while (hand.calculateValue() < 17) {
            Card card = deck.dealCard();
            hand.addCard(card);
        }
    }

    public Hand getHand() {
        return hand;
    }
}
