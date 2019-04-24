import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Bet myBet = new Bet.Builder()
                .withKind("Percent Bet")
                .withName("Football")
                .withTeam("Real Madrid")
                .withDate( new Date() )
                .withAmount(2500)
                .build();
        myBet.getInfo();
    }
}
