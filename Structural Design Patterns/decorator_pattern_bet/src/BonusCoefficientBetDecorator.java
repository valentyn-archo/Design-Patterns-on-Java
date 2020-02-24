public class BonusCoefficientBetDecorator extends  BetDecorator {

    public BonusCoefficientBetDecorator (Bet decoratedBet) {
        super(decoratedBet);
    }

    @Override
    public void makeBet() {
        decoratedBet.makeBet();
        System.out.println("System add 0.14 for your coefficient!!!");
    }
}
