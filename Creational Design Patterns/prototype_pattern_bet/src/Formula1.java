public class Formula1 extends Bet {
    public String best_driver;

    public Formula1() {
    }

    public Formula1(Formula1 target) {
        super(target);
        if (target != null) {
            this.best_driver = target.best_driver;
        }
    }

    @Override
    public Bet clone() {
        return new Formula1(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Formula1) || !super.equals(object2)) return false;
        Formula1 bet2 = (Formula1) object2;
        return bet2.best_driver == best_driver;
    }

    public void getInfo() {
        System.out.println("-------------------------\nBet Info\n-------------------------\n" + "Type of bet: " + type + ",\n"
                + "Team: " + team + ",\n"
                + "Amount on bet: " + amount + ",\n" + "Best driver: " + best_driver + ".\n");
    }
}
