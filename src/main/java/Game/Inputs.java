package Game;

import java.util.Scanner;

public class Inputs {

    Scanner scanner = new Scanner(System.in);


    public int requestNumber(){
        int cell = 0;
        while (cell < 1 || cell > 9){
            String input = scanner.nextLine();
            try {
                cell = Integer.parseInt(input);
            } catch (Exception ex){};
            if (cell > 0 && cell < 10){
                System.out.println("Ok");
            } else {
                System.out.println("Wrong number");
                System.out.println(cell);
            }
        }
        return cell;

    }

}
