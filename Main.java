import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static String winner = null;

    private static List sectorList = new ArrayList<Sector>();
    private static List players = new ArrayList<Player>();
    private static Player currentPlayer = null;

    public static void main(String [] args) {
        sectorList.add(new Sector1());
        sectorList.add(new Sector1());
        sectorList.add(new Sector1());
        sectorList.add(new Sector1());
        String playerName = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name");
        playerName = in.nextLine();
        players.add(new Human(playerName));
        System.out.println("Choice type of game (Hint: if you want to play width computer just type \" PwC\"," +
                " or type \" PwP\" if you want play width human)");
        if (in.nextLine().equals("PwC")) {
            players.add(new Computer("PC"));
        } else {
            System.out.println("Enter you name player2");
            playerName = in.nextLine();
            players.add(playerName);
        }

        System.out.println("Ok let`s start!");
        play();
    }

    public static void RollDice() {
        int numberOfSteps = (int) Math.round(((Math.random())* 10) + 2);
        Sector currentSector = null;
        System.out.println("You number of steps is " + numberOfSteps);
        currentPlayer.setPosition(currentPlayer.getPosition() + numberOfSteps);
        currentSector = (Sector) sectorList.get(currentPlayer.getPosition());
        System.out.println(currentSector.getName() + currentSector.getDescription());
    }

    public static void play() {
        String playerChoice = null;

        while (winner == null) {
            System.out.println("Player 1 turn, you can \"roll\" dice or try \"build\"");
            currentPlayer = (Player) players.get(0);
            Scanner in = new Scanner(System.in);
            playerChoice = in.nextLine();
            if (playerChoice.equals("roll")) {
                RollDice();
            } else if (playerChoice.equals("build") && ((Sector) sectorList.get(currentPlayer.getPosition())).getPlayer() == null) {
                System.out.println(currentPlayer.name + " build 1 ");
                ((Sector) sectorList.get(currentPlayer.getPosition())).setPlayer(currentPlayer.getName());
            }
        }
    }
}
