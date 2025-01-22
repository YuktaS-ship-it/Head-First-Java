package chap02;

public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        System.out.println("=========Instantiated object guessGame from gameLauncher class======");
        game.startGame();
        System.out.println("=============Game Object was: "+ game.toString()+ " ========");

    }
}
