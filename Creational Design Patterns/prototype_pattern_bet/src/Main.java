import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bet> bets = new ArrayList<>();
        List<Bet> betsCopy = new ArrayList<>();

        Football football = new Football();
        football.type = "percent bet";
        football.amount = 200;
        football.goalkeeper = "Muller";
        football.team = "Schachtar";
        football.getInfo();
        bets.add(football);

        Football anotherFootball = (Football) football.clone();
        anotherFootball.getInfo();
        betsCopy.add(anotherFootball);

        Formula1 formula1 = new Formula1();
        formula1.best_driver = "Michael Schumacher";
        formula1.type = "on best driver";
        formula1.team = "Janbo";
        formula1.amount = 2500;
        formula1.getInfo();
        bets.add(formula1);

        Formula1 anotherFormula1 = (Formula1) formula1.clone();
        anotherFormula1.getInfo();
        betsCopy.add(anotherFormula1);

        football.amount = 500;
        football.goalkeeper = "Konoplyk";
        football.getInfo();
        anotherFootball.getInfo();

        cloneAndCompare(bets, betsCopy);
    }

    private static void cloneAndCompare(List<Bet> bets, List<Bet> betsCopy) {
        for (Bet bet : bets) {
            betsCopy.add(bet.clone());
        }

        for (int i = 0; i < bets.size(); i++) {
            if (bets.get(i) != betsCopy.get(i)) {
                System.out.println(i + ": Bets are different objects...");
                if (bets.get(i).equals(betsCopy.get(i))) {
                    System.out.println(i + ": And they are identical...");
                } else {
                    System.out.println(i + ": But they are not identical...");
                }
            } else {
                System.out.println(i + ": Shape objects are the same...");
            }
        }
    }
}
