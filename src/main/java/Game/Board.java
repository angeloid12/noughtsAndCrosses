package Game;

public class Board {

    private String[][] board = new String[3][3];
    private String[][] availableCells = new String[3][3];
    private int row;
    private int column;

    Board(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = " ";
                availableCells[i][j] = Integer.toString(i*3+j+1);
            }
        }
    }

    public void setRowAndColumn(int number){
        this.column = (number-1)%3;
        this.row = ((number-1)-column)/3;
    }

    public String getCellValue(int row, int column){
        return board[row][column];
    }

    public void fillACell(int cell, String sign){
        setRowAndColumn(cell);
        if (board[row][column].equals(" ")) {
            board[row][column] = sign;
            availableCells[row][column] = " ";
        } else {
            System.out.println("Choose another cell");
        }
    }

    public void showBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void showAvailableCells(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + availableCells[i][j] + "]");
            }
            System.out.println();
        }
    }

    public boolean isCellAvailable(String str) {
        boolean bool = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (availableCells[i][j].equals(str)){
                    bool = true;
                }
            }

        }
        return bool;
    }
}
