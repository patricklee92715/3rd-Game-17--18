import java.util.*;
/**
 * Driver class, sets up game
 * 
 * To test your code, add a line like players.add(new ________)
 * of your class
 */
public class Driver
{
    public static void main(String [] args)
    {
        List <Player> players = new ArrayList <Player> ();
        boolean printsRun = false;
        //add players to game
        players.add(new Example1());
        //players.add(new Example2());
        //players.add(new PlayerExample());
        players.add(new Patrick());
        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();   
    }
}
