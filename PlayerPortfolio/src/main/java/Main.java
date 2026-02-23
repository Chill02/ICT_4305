public class Main {
    public static void main(String[] args) {

        NFLPlayer myNFLPlayer = new NFLPlayer("David", 2);

        System.out.println(myNFLPlayer.getSport());
        System.out.println(myNFLPlayer.getAction());

        System.out.println(myNFLPlayer.getProfile());

        NBAPlayerA myNBAPlayer = new NBAPlayerA("Mark", 30);
        System.out.println("NBA Player " + myNBAPlayer.name + " averages " + myNBAPlayer.stats
        + " points per game.");

        myNBAPlayer.dribble();







    }
}
