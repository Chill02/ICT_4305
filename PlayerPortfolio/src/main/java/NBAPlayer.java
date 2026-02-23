public class NBAPlayer implements Player {

    private final String name;
    private final int pointsPerGame;
    private final String sport = "NBA";
    private final String action = "3 Point Shot";

    public NBAPlayer(String name, int pointsPerGame) {
        this.name = name;
        this.pointsPerGame = pointsPerGame;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getStats() {
        return pointsPerGame;
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
                "Name: %s | Sport: %s | Points Per Game: %d |",
                name, sport, pointsPerGame);
    }

    }

