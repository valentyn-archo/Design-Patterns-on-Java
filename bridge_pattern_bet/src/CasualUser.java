public class CasualUser implements User {

    protected Bet bet;

    public CasualUser() {}

    public CasualUser(Bet bet) {
        this.bet = bet;
    }

    @Override
    public void makeBet(){
        System.out.println("Bet was created...");
    }
}
