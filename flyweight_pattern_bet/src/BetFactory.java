import java.util.HashMap;

public class BetFactory {
    private static final HashMap betMap = new HashMap();

    public static Bet getBet(String name) {
        BetImpl bet = (BetImpl)betMap.get(name);

        if(bet == null) {
            bet = new BetImpl(name);
            betMap.put(name, bet);
            System.out.println("Creating bet name: " + name);
        }
        return bet;
    }
}
