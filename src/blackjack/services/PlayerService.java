package blackjack.services;

import blackjack.Card;
import blackjack.Game;
import blackjack.Hand;

import java.util.Scanner;

public class PlayerService {
    private final String name;
    private int moneyInPossession;
    private int bet;
    private final Hand hand;

    public PlayerService(String name) {
        this.name = name;
        buyIntoTable();
        hand = new Hand();
    }

    private void buyIntoTable() {
        Scanner scanner = new Scanner(System.in);
        //TODO should maybe make a range to prevent users from going out of bounds. or have the user start at a specified amount.

        System.out.print("How much would you like to buy into the table with: ");
        moneyInPossession = scanner.nextInt();
    }

    public PlayerService(String name, int money) {
        this.name = name;
        this.moneyInPossession = money;
        hand = new Hand();
    }

    public void addCardToHand(Card card) {
        hand.addCard(card);
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void placeBet() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much would you like to bet?: Enter a value between 0-" + moneyInPossession + ": ");
         bet = scanner.nextInt();

        if (bet <= moneyInPossession) {
            moneyInPossession -= bet;
            System.out.println("moneyInPossession = " + moneyInPossession);
        }
    }

    public int getMoneyInPossession() {
        return moneyInPossession;
    }

    public void setMoneyInPossession(int moneyInPossession) {
        this.moneyInPossession = moneyInPossession;
    }

    public int getBet() {
        return bet;
    }
}
