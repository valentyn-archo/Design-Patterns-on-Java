public class Application {
    private PercentBet percentBet;
    private BestPlayerBet bestPlayerBet;

    public Application(BetAbstractFabric factory) {
        percentBet = factory.createPercentBet();
        bestPlayerBet = factory.createBestPlayerBet();
    }

    public void makeBet() {
        percentBet.makeBet();
        bestPlayerBet.makeBet();
    }
}
