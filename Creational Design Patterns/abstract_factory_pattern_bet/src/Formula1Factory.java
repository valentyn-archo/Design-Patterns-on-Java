public class Formula1Factory implements BetAbstractFabric {

    @Override
    public PercentBet createPercentBet() {
        return new Formula1BetPercent();
    }

    @Override
    public BestPlayerBet createBestPlayerBet() {
        return new Formula1BetBestPlayer();
    }
}
