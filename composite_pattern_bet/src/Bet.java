import java.util.ArrayList;
import java.util.List;

public class Bet {
    private String type;
    private String name;
    private String team;
    private int amount;

    public Bet(String type,String name, String team, int amount) {
        this.type = type;
        this.name = name;
        this.team = team;
        this.amount = amount;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + "Name: " + name + ", " + "type: " + type + ", " + "team: " + team + ", "
        + "amount: " + amount + ".\n");
    }
}

