import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class Example2 implements Player
{
    private static String name = "Example1";
    private static String teamNames = "Sos1";
    private static String strategy = "Always rock";
    
    public String move(List <String> myMoves, List <String> opponentMoves, int myScore, int opponentScore)
    {
        if(myMoves.size() == 0)
            return "r";
        else
            return "s";
    }
    
    public String getName()
    {
        return name;
    }
}
