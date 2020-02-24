public class Main {

    public static void main(String[] args) {
        Bet football = new Football();

        Bet bonusCoefficientFootballBet = new BonusCoefficientBetDecorator(new Football());

        Bet bonusCoefficientChessBet = new BonusCoefficientBetDecorator(new Chess());
        System.out.println("Casual football bet: ");
        football.makeBet();

        System.out.println("\nFootball bet with bonus coefficient: ");
        bonusCoefficientFootballBet.makeBet();

        System.out.println("\nChess bet with bonus coefficient: ");
        bonusCoefficientChessBet.makeBet();
    }
}
