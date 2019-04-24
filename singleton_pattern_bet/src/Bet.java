public class Bet {
    private static Bet instance;
    public String type;
    public String name;
    public String team;
    public int amount;

    private Bet(String type, String name, String team, int amount){
        this.type = type;
        this.name = name;
        this.team = team;
        this.amount = amount;
    }

    public static Bet getInstance(String type, String name, String team, int amount) {
        if (instance == null) {
            instance = new Bet(type, name, team, amount);
        }
        return instance;
    }

    public void getInfo() {
        System.out.println("-------------------------\nBet Info\n-------------------------\n" + "Type of bet: " + type + ",\n"
                + "Name of bet: " + name + ",\n" + "Team: " + team + ",\n"
                + "Amount on bet: " + amount + ".\n");
    }
}
