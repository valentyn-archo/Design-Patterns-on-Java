public class Main {

    public static void main(String[] args) {
        Application app;
        BetAbstractFabric factory;
        factory = new FootballFactory();
        app = new Application(factory);
        app.makeBet();
        factory = new Formula1Factory();
        app = new Application(factory);
        app.makeBet();
    }
}
