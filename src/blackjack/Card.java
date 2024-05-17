package blackjack;

public record Card(String rank, String suit) {
    public String getFormattedSuit() {
        return switch (suit) {
            case "Spades" -> "♠";
            case "Hearts" -> "♥";
            case "Diamonds" -> "♦";
            case "Clubs" -> "♣";
            default -> suit;
        };
    }
}
