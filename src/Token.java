public class Token implements Pieces
{
    private String Name;
    private int start = 0;

    public Token(String Name)
    {
        this.Name = Name;
    }

    public int getStartOfToken() {
        return start;
    }

    public void setStartOfToken(int start) {
        this.start = start;
    }

    @Override
    public String getPiece() {
        return Name;
    }

    @Override
    public int getEnd() {
        return -1;
    }
}
