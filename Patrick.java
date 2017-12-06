import java.util.*;
public class Patrick implements Player
{
    private static String name = "Patrick";
    private static String strategy = "Win";
    public String move(List <String> myMoves, List <String> opponentMoves, int myScore, int opponentScore)
    {
        int rockCount = 0;
        int paperCount = 0;
        int scizorCount = 0;
        for(int i = 0; i < opponentMoves.size(); i++)
        {
            if(opponentMoves.get(i) == "r")
            {
                rockCount++;
            }
        }
        for(int i = 0; i < opponentMoves.size(); i++)
        {
            if(opponentMoves.get(i) == "p")
            {
                paperCount++;
            }
        }
        for(int i = 0; i < opponentMoves.size(); i++)
        {
            if(opponentMoves.get(i) == "s")
            {
                scizorCount++;
            }
        }
        if(rockCount > paperCount & rockCount > scizorCount)
        {
            return "p";
        }
        if(rockCount < paperCount & paperCount < scizorCount) 
        {
            return "r";  
        }
        if(rockCount < paperCount & paperCount > scizorCount)
        {
            return "s";
        }
        else
        {
            return "p";
        }
    }

    public String getName()
    {
        return name;
    }
}