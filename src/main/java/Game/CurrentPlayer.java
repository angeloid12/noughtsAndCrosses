package Game;

public class CurrentPlayer {
    private Player playerOne;
    private Player playerTwo;
    private Player currentPlayer;

    CurrentPlayer(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        currentPlayer = playerOne;
    }

    public int chooseNumber(){
        return currentPlayer.chooseNumber();
    }

    public void warningMessage(){
        currentPlayer.warningMessage();
    }

    public String getSign() {
        return currentPlayer.getSign();
    }

    public String getName(){
        return currentPlayer.getName();
    }

    public void switchPlayers(){
        if (currentPlayer.equals(playerOne)) {
            currentPlayer = playerTwo;
        } else if (currentPlayer.equals(playerTwo)) {
            currentPlayer = playerOne;
        }
    }
}
