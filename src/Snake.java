public class Snake implements Pieces
{
    private String S = "Snake";
    private int start;
    private int end;

    public Snake(int start , int end)
    {
        this.start = start;
        this.end = end;
    }

    public int getStartOfSnake()
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
        return S;
    }
}
