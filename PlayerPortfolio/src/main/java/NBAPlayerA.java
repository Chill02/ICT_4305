public class NBAPlayerA extends PlayerA implements Dribbles{

    public NBAPlayerA(String name, int stats) {
        super(name, stats, "NBA");
    }

    @Override
    int getStatsA() {return stats;}

    @Override
    String getSportA() {
        return sport;
    }

    @Override
    public void dribble() {System.out.println("NBA player " + name + " can shoot and dribble");}
}
