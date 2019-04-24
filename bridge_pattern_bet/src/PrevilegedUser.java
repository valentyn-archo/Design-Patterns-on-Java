public class PrevilegedUser extends CasualUser {
    public PrevilegedUser(Bet bet) {
        super.bet = bet;
    }

    public double bonus() {
        bet.addCoef(0.14);
        return bet.getCoefficient();
    }
}
