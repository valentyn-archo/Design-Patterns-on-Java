public class Football implements Bet{
    private int amount;
    private double percent;

    public Football(int amount, double percent) {
        this.amount = amount;
        this.percent = percent;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double getTotalWin() {
        System.out.println("Football bet is not adapted...");
        return 0.0;
    }
}
