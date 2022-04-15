public class Piece {

    private String id;
    private final String color;
    private int x;
    private int y;

    public Piece(String id, String color, int x, int y) {
        this.id = id;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(ChessGame game, int targetX, int targetY) {
    }

    protected boolean isValidMove(int targetX, int targetY) {
        return false;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
