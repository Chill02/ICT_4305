public abstract class PlayerA {

    protected String name;
    protected int stats;
    protected String sport;

    public PlayerA(String name, int stats, String sport) {
        this.name = name;
        this.stats = stats;
        this.sport = sport;
    }

    public String getNameA() {
        return name;
    }

    abstract int getStatsA();
    abstract String getSportA();
}
