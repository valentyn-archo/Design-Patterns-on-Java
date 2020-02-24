public class BetImpl implements Bet {
    private String type;
    private String name;
    private int amount;

    public BetImpl(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void makeBet() {
        System.out.println("Bet was created...\n");
        System.out.println("Bet Info: " + "Name: " + name + ", " + "type: " + type + ", "
                + "amount: " + amount + ".\n");
    }
}
