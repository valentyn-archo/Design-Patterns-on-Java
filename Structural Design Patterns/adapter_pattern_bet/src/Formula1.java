public class Formula1 implements Bet{
    private int amount;
    private double coefficient;

    public Formula1(int amount, double coefficient) {
        this.amount = amount;
        this.coefficient = coefficient;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double getTotalWin() {
        System.out.println("Formula 1 bet is always adapted...");
        return coefficient * amount;
    }
}
