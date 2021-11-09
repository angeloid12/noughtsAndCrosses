package Game;

public abstract class Player {

    private String sign;
    private String name;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int chooseNumber();

    public abstract void warningMessage();

}
