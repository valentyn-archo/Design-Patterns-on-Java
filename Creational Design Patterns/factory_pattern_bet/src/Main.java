public class Main {

    public static void main(String[] args) {
        BetFactory factory = new BetFactory();

        Bet football = factory.getBet(BetTypes.FOOTBALL);
        Bet formula1 = factory.getBet(BetTypes.FORMULA1);
        Bet politic = factory.getBet(BetTypes.POLITIC);

        football.makeBet();
        formula1.makeBet();
        politic.makeBet();
    }
}
