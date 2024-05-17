package blackjack.services;

import blackjack.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckService {
    private final List<Card> deck;

    public DeckService() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        if (deck.isEmpty()) {
            return null; // Handle deck empty condition
        }
        return deck.remove(deck.size() - 1);
    }
}
