import java.util.Date;
import java.util.Set;

public class Bet {
    private String kind;
    private String name;
    private String team;
    private Date date_of_bet;
    private int amount;
    private Set<Bet> parents;

    public static class Builder {
        private Bet newBet;

        public Builder() {
            newBet = new Bet();
        }

        public Builder withKind(String kind){
            newBet.kind = kind;
            return this;
        }

        public Builder withName(String name){
            newBet.name = name;
            return this;
        }

        public Builder withTeam(String team){
            newBet.team = team;
            return this;
        }

        public Builder withDate(Date date_of_bet){
            newBet.date_of_bet = date_of_bet;
            return this;
        }

        public Builder withAmount(int amount){
            newBet.amount = amount;
            return this;
        }

        public Builder withParents(Set<Bet> parents){
            newBet.parents = parents;
            return this;
        }

        public Bet build(){
            return newBet;
        }
    }

    public void getInfo() {
        System.out.println("-------------------------\nBet Info\n-------------------------\n" + "Kind of bet: " + kind + ",\n"
                + "Name of bet: " + name + ",\n" + "Team: " + team + ",\n"
                + "Date of bet: " + date_of_bet + ",\n" + "Amount on bet: " + amount + ".\n");
    }
}
