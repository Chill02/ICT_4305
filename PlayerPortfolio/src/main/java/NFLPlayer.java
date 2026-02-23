public class NFLPlayer implements Player {

    private final String name;
    private final int touchDowns;
    private final String sport = "NFL";
    private final String action = "Running Blocking Tackling";


    public NFLPlayer(String name, int touchDowns) {
        this.name = name;
        this.touchDowns = touchDowns;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStats() {
        return touchDowns;
    }

    @Override
    public String getSport() {
        return sport;
    }
    @Override
    public String getAction() {
        return action;
    }

    @Override
    public String getProfile() {
        return String.format (
                "Name: %s | Sport: %s | Touchdowns: %s |",
                name, sport, touchDowns);
    }
}

