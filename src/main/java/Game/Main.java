package Game;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Player playerOne = new RealPlayer("X", "Player One");
        Player playerTwo = new ComputerPlayer("0", "Player Two");
        CurrentPlayer currentPlayer = new CurrentPlayer(playerOne, playerTwo);
        Inputs inputs = new Inputs();
        BoardCheck boardCheck = new BoardCheck(board);
        MakeATurn makeATurn = new MakeATurn(currentPlayer, board, inputs, boardCheck);

        makeATurn.runGame();

    }
}
