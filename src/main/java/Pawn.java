public class Pawn extends Piece {

    public Pawn(String id, String color, int x, int y) {
        super(id, color, x, y);
    }

    @Override
    public void move(ChessGame game, int targetX, int targetY) {
        if (this.isValidMove(targetX, targetY)) {
            game.setPieceCoordinate(this, targetX, targetY);
        }
    }

    @Override
    protected boolean isValidMove(int targetX, int targetY) {
        // One step forward only
        return this.getY() + 1 == targetY;
    }

    @Override
    public String toString() {
        return "Pawn{" +
                "id=" + this.getId() +
                ", color='" + this.getColor() + '\'' +
                ", x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
