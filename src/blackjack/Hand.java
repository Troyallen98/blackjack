package blackjack;

import blackjack.services.HandService;

import java.util.List;

public class Hand {
    private final HandService handService;

    public Hand() {
        handService = new HandService();
    }

    public void addCard(Card card) {
        handService.addCard(card);
    }

    public int calculateValue() {
        return handService.calculateValue();
    }

    public void clear() {
        handService.clear();
    }

    public List<Card> getCards() {
        return handService.getCards();
    }

    public boolean isBusted() {
        return handService.isBusted();
    }

    public boolean is21() {
        return handService.is21();
    }
}






