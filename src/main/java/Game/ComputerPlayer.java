package Game;

import java.util.Random;

public class ComputerPlayer extends Player{

    Random generateNumber = new Random();

    ComputerPlayer(String sign, String name){
        setSign(sign);
        setName(name);
    }

    public int chooseNumber() {
        return generateNumber.nextInt(9) + 1;
    }

    public void warningMessage() {}
}
