public class Football implements Bet {
    private int amount;
    private String team;
    private double coefficient;

    @Override
    public double availableWinAmount(){
        return amount*coefficient;
    }

    public Football(int amount, String team, double coefficient) {
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
        System.out.println("| It`s bet on Football.");
        System.out.println("| Amount on bet: " + amount + " UAH.");
        System.out.println("| Current team is " + team + ".");
        System.out.println("| Available win amount " + availableWinAmount() + ".");
        System.out.println("------------------------------------\n");
    }

}
