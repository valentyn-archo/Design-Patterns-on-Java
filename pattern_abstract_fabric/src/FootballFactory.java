public class FootballFactory implements BetAbstractFabric {
    public PercentBet createPercentBet() {
        return new FootballBetPercent();
    }

    @Override
    public BestPlayerBet createBestPlayerBet() {
        return new FootballBetBestPlayer();
    }
}
