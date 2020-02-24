public class Main {

    public static void main(String[] args) {
        Bet bet1 = new Football(1000, 150);
        System.out.println(bet1.getTotalWin());
        Bet bet2 = new Formula1(1000, 0.84);
        System.out.println(bet2.getTotalWin());
        FootballAdapter footballAdapter = new FootballAdapterImpl((Football) bet1);
        System.out.println(footballAdapter.getTotalWin());
    }
}
