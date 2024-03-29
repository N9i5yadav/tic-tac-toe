package game;
import board.Board;
import player.Players;
import java.util.Scanner;

public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    Boolean gameOver;
    String zero;
    String cross;
}

public game(Player[]players,Board board){
    this.player=player;
    this.board=board;
    this.turn=0;
    this.noOfMoves=0;
    this.gameOver=false;

    StringBuilder z=new StringBuilder();
    StringBuilder c=new StringBuilder();
    for(int i=0;i<board.size;i++){
        z.append('0');
        c.append('X');
    }
    this.zero=z.toString();
    this.cross=c.toString();
}
