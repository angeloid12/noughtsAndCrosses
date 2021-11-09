package Game;

import java.util.Scanner;

public class RealPlayer extends Player{

    Scanner scanner = new Scanner(System.in);

    RealPlayer(String sign, String name){
        this.setSign(sign);
        this.setName(name);
    }

    public int chooseNumber(){
        int cell = 0;
        while (true){
            String input = scanner.nextLine();
            try {
                cell = Integer.parseInt(input);
            } catch (Exception ex){};
            if (cell > 0 && cell < 10){
                break;
            } else {
                System.out.println("Wrong number");
            }
        }
        return cell;

    }

    public void warningMessage() {
        System.out.println("Choose another cell");
    }

}
