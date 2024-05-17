package blackjack;

import blackjack.services.GameService;


public class Game {
    private final GameService gameService;

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }

    public Game() {
        gameService = new GameService();
    }

    public void start() {
        gameService.start();
    }
}
