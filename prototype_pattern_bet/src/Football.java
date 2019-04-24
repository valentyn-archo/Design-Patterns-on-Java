public class Football extends Bet {
    public String goalkeeper;

    public Football() {
    }

    public Football(Football target) {
        super(target);
        if (target != null) {
            this.goalkeeper = target.goalkeeper;
        }
    }

    @Override
    public Bet clone() {
        return new Football(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Football) || !super.equals(object2)) return false;
        Football bet2 = (Football) object2;
        return bet2.goalkeeper == goalkeeper;
    }

    public void getInfo() {
        System.out.println("-------------------------\nBet Info\n-------------------------\n" + "Type of bet: " + type + ",\n"
                + "Team: " + team + ",\n"
                + "Amount on bet: " + amount + ",\n" + "Goalkeeper: " + goalkeeper + ".\n");
    }
}

