public abstract class Player {
    protected int position;
    protected int money = 1500;
    protected boolean inJail;
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isInJail() {
        return inJail;
    }
    public void toJail(boolean inJail) {
        this.inJail = inJail;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
}
