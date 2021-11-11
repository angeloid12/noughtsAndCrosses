package Game;

public class MakeATurn {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;
    private Board board;
    private BoardCheck boardCheck;

    MakeATurn(Player playerOne, Player playerTwo, Board board, BoardCheck boardCheck){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.currentPlayer = playerOne;
        this.board = board;
        this.boardCheck = boardCheck;
    }

    public boolean makeATurn(){
        boolean victoryCondition;
        int field;
        System.out.println("Choose your cell");
        board.showAvailableCells();
        while(true){
            field = currentPlayer.chooseNumber();
            if (board.isCellAvailable(Integer.toString(field))) {
                board.fillACell(field, currentPlayer.getSign());
                break;
            } else {
                currentPlayer.warningMessage();
            }
        }
        board.showBoard();
        victoryCondition = boardCheck.check(field, currentPlayer.getSign(), board);
        if(victoryCondition == false){
            switchPlayers();
        }
        return victoryCondition;
    }

    public void runGame(){
        for(int i = 0; i < 9; i++){
            if(makeATurn() == true){
                System.out.println(currentPlayer.getName() + " is winner!");
                break;
            } else {
                if (i > 7){
                    System.out.println("Draw!");
                }
            }
        }
    }

    public void switchPlayers(){
        if (currentPlayer.equals(playerOne)) {
            currentPlayer = playerTwo;
        } else if (currentPlayer.equals(playerTwo)) {
            currentPlayer = playerOne;
        }
    }

}
