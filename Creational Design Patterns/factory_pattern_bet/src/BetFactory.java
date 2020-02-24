public class BetFactory {

    public Bet getBet(BetTypes type) {
        Bet toReturn = null;
        switch (type) {
            case POLITIC:
                toReturn = new Politic();
                break;
            case FOOTBALL:
                toReturn = new Football();
                break;
            case FORMULA1:
                toReturn = new Formula1();
                break;
            default:
                throw new IllegalArgumentException("Wrong bet type:" + type);
        }
        return toReturn;
    }

}
