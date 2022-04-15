import java.util.Arrays;

public class ChessGame {
    public Piece[][] board;

    public ChessGame() {
        board = new Piece[7][7];
    }

    public void setPieceCoordinate(Piece piece) {
        // Set initial location
        int x = piece.getX();
        int y = piece.getY();
        board[x][y] = piece;
    }

    public void setPieceCoordinate(Piece piece, int targetX, int targetY) {
        // Remove previous location
        int x = piece.getX();
        int y = piece.getY();
        board[x][y] = null;

        // Set new location
        board[targetX][targetY] = piece;
    }

    @Override
    public String toString() {
        return "ChessGame{" +
                "board=" + Arrays.deepToString(board) +
                '}';
    }
}
