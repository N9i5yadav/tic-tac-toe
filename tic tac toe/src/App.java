import board.Board;
import player.Player;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project>>> Tic Tac Toe");
        Board b=new Board(4,'-');
        b.printBoardConfig();

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the name of the player: ");
        String name=scn.nextLine();
        System.out.println("Enter the Symbol: ");
        char symbol=scn.nextLine().charAt(0);

        Player p1=new Player();
        p1.setPlayerNameAndSymbol(name,symbol);
        p1.getPlayerNameAndSymbol();

        Player p2=new Player();
        p2.setPlayerNameAndSymbol("Akash",'0');
        p2.getPlayerNameAndSymbol();
    }
}