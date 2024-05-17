package blackjack.services;

import blackjack.Card;

import java.util.ArrayList;
import java.util.List;

public class HandService {
    private final List<Card> cards;

    public HandService() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateValue() {
        int value = 0;

        for (Card card : cards) {
            String rank = card.rank();

            if ("Ace".equals(rank)) {
                if (value <= 10) {
                    value += 11; // Assume initial value of Ace as 11
                } else {
                    value++;
                }
            } else if ("King".equals(rank) || "Queen".equals(rank) || "Jack".equals(rank)) {
                value += 10;
            } else {
                value += Integer.parseInt(rank);
            }
        }

        return value;
    }

    public void clear() {
        cards.clear();
    }

    public List<Card> getCards() {
        return cards;
    }

    public boolean isBusted() {
        return calculateValue() > 21;
    }

    public boolean is21() {
        return calculateValue() == 21;
    }
}
