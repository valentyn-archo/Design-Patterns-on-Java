public abstract class BetDecorator implements Bet{
    protected Bet decoratedBet;

    public BetDecorator(Bet decoratedBet){
        this.decoratedBet = decoratedBet;
    }

    public void makeBet(){
        decoratedBet.makeBet();
    }
}
