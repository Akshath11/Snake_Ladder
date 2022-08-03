public class Ladder implements Pieces
{
    private String L = "Ladder";
    private int start;
    private int end;

    public Ladder(int start , int end)
    {
        this.start = start;
        this.end = end;
    }

    public int getStartOfLadder()
    {
        return start;
    }

    public int getEnd()
    {
        return end;
    }

    @Override
    public String getPiece()
    {
        return L;
    }
}
