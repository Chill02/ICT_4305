public class NFLPlayerA extends PlayerA {

    public NFLPlayerA(String name, int stats) {
        super(name, stats, "NFL");
    }

    @Override
    int getStatsA() {return stats;}

    @Override
    String getSportA() {
        return sport;
    }
}

