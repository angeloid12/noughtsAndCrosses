package Game;

public class MakeATurn {
    private CurrentPlayer currentPlayer;
    private Board board;
    private Inputs inputs;
    private BoardCheck boardCheck;

    MakeATurn(CurrentPlayer currentPlayer, Board board, Inputs inputs, BoardCheck boardCheck){
        this.currentPlayer = currentPlayer;
        this.board = board;
        this.inputs = inputs;
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
            currentPlayer.switchPlayers();
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

}
