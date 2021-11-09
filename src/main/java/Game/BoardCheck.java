package Game;

public class BoardCheck {

        private Board board;
        private int row;
        private int column;

        BoardCheck(Board board) {
            this.board = board;
        }

        public boolean lineCheck(String sign, int rowStep, int columnStep){
            String[] threeSigns = {" ", " ", " "};
            int counter = 0;
            for(int i = -2; i < 3; i++){
                try {
                    threeSigns[counter] = board.getCellValue(row + i * rowStep, column + i * columnStep);
                    counter++;
                } catch (Exception ex){
                    continue;
                }
            }
           return (threeSigns[0].equals(sign) && threeSigns[1].equals(sign) && threeSigns[2].equals(sign));
        }

        public void setRowAnColumn(int number) {
            this.column = (number - 1) % 3;
            this.row = ((number - 1) - column) / 3;
        }

        public boolean check(int number, String sign, Board board) {
            this.board = board;
            setRowAnColumn(number);
            return (lineCheck(sign, 0, 1) ||
                            lineCheck(sign, 1, 0) ||
                            lineCheck(sign, 1, 1) ||
                            lineCheck(sign, -1, 1));

        }

}