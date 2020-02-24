public class Main {

    private static final String name[] = { "Football", "Formula 1", "Chess", "Politic", "Rally" };
    private static final String type[] = { "best player bet", "percent bet" };

    public static void main(String[] args) {
        for(int i=0; i < 10; ++i) {
            BetImpl bet = (BetImpl)BetFactory.getBet(getRandomName());
            bet.setType(getRandomType());
            bet.setAmount(getRandomAmount());
            bet.makeBet();
        }
    }
    private static String getRandomName() {
        return name[(int)(Math.random()*name.length)];
    }

    private static String getRandomType() {
        return type[(int)(Math.random()*type.length)];
    }

    private static int getRandomAmount() {
        return (int)(Math.random()*10000);
    }
}
