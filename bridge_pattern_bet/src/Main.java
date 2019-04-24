public class Main {

    public static void main(String[] args) {
        testBet(new Football(1000, "Real Madrid", 1.84));
        testBet(new Formula1(817, "Florenco", 4.12));
    }

    public static void testBet(Bet bet) {
        System.out.println("Tests with casual user...");
        CasualUser casualUser = new CasualUser(bet);
        casualUser.makeBet();
        bet.getInfo();

        System.out.println("Tests with previleged user...");
        PrevilegedUser previlegedUser = new PrevilegedUser(bet);
        System.out.println("New bet coefficient is: " + previlegedUser.bonus());
        bet.getInfo();
    }
}
