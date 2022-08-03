import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Game
{
    public static Board B = new Board();
    private static Deque<Player> players = new LinkedList<>();

    public  Game()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi , Welcome to the game of LUDO.");
        System.out.println("Please input the number of players in the game");
        int Players = sc.nextInt();

        while(Players --> 0)
        {
            System.out.println("Enter the name of player " + Players + " please.");
            String Name = sc.next();
            System.out.println("Enter the name of pawn the player wants to have");
            String PawnName  = sc.next();
            B.addSnakes();
            B.addLadders();
            Player p = new Player(Name , new Token(PawnName));
            players.add(p);
        }

        System.out.println("Please type START to start the Game");
        String UseLessString = sc.next();
        StartGame();
    }


    public void StartGame()
    {
        Boolean GameWon = false;
        while(!GameWon)
        {
            Player current = players.pop();
            Scanner sc = new Scanner(System.in);
           //System.out.println("Please roll the dice");
           // int dice = sc.nextInt();
            int dice = 0;
            boolean invalidDie = true;
            
            while(invalidDie)
            {
                System.out.println("Player " + current.Name + " Please roll the dice");
                 dice = sc.nextInt();
                 if(dice <= 6 && dice >= 0)
                {
                    invalidDie = false;
                }
                 else
                 {
                     System.out.println("Invalid input");
                 }
                 
            }
            
            int current_position = current.disk.getStartOfToken();
            current_position = current_position + dice;

            if(current_position == 100)
            {
                GameWon = true;
                System.out.println("Player " + current.Name + " with Token " + current.disk.getPiece() + " has won the game.");
                continue;
            }
            current.disk.setStartOfToken(current_position);
            if(B.Check_If_SnakeOrLadder(current.disk))
            {
                current.disk.setStartOfToken(B.UpdatePosition_SnakeOrLadder(current_position));
            }

            System.out.println(current.Name + " You are at " + current.disk.getStartOfToken());
            players.add(current);
        }
    }
}
