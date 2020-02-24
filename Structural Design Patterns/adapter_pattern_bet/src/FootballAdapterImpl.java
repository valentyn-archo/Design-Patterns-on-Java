public class FootballAdapterImpl implements FootballAdapter{
    private Football football;

    public FootballAdapterImpl(Football football) {
        this.football = football;
    }

    @Override
    public double getTotalWin() {
        double percent = football.getPercent();
        return convertToCoefficient(percent) * football.getAmount();
    }

    private double convertToCoefficient(double percent) {
        System.out.println("Football bet is now adapted...");
        return percent / 100;
    }
}
