public class Formula1 implements Bet{
    private int amount;
    private String team;
    private double coefficient;

    @Override
    public double availableWinAmount(){
        return amount*coefficient;
    }

    public Formula1(int amount, String team, double coefficient) {
        this.amount = amount;
        this.team = team;
        this.coefficient = coefficient;
    }

    @Override
    public void addCoef(double coefficient) {
        this.coefficient += coefficient;
    }

    @Override
    public double getCoefficient() {
        return this.coefficient;
    }

    @Override
    public void getInfo() {
        System.out.println("------------------------------------");
        System.out.println("| It`s bet on Formula 1.");
        System.out.println("| Amount on bet: " + amount + " UAH.");
        System.out.println("| Current team is " + team + ".");
        System.out.println("| Available win amount " + availableWinAmount() + ".");
        System.out.println("------------------------------------\n");
    }
}
