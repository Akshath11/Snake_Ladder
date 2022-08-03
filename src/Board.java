public class Board {
    Pieces[] Board;

    public Board()
    {
        this.Board = new Pieces[101];
    }

    public boolean Check_If_SnakeOrLadder(Token piece) // Check if the current position the player is at has a Snake or ladder or nothing.
    {
        if(Board[piece.getStartOfToken()] == null)
        {
            return false;
        }
        else if(Board[piece.getStartOfToken()].getPiece().equals("Snake") ||  Board[piece.getStartOfToken()].getPiece().equals("Ladder"))
        {
            return true;
        }
        return false;

    }

    public int UpdatePosition_SnakeOrLadder(int PlayerPosition)
    {
        if(Board[PlayerPosition].getPiece().equals("Snake"))
        {
            System.out.println("OOPS , You have been eaten by the snake.");
        }
        else
        {
            System.out.println("YAY , You have been granted a ladder to heaven.");
        }
        return Board[PlayerPosition].getEnd();
    }
    public void addSnakes()
    {
        Board[99] = new Snake(99,1);
        Board[48] = new Snake(48,18);
        Board[36] = new Snake(36,6);
        Board[32] = new Snake(32,2);
    }

    public void addLadders()
    {
        Board[1] = new Ladder(1,38);
        Board[4] = new Ladder(4,14);
        Board[8] = new Ladder(8,20);
        Board[28] = new Ladder(28,76);
    }

}
