public class Main {

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        Pawn pawn = new Pawn("1", "white", 2, 1);

        game.setPieceCoordinate(pawn);

        pawn.move(game, 2, 2);

        System.out.println(game);
    }
}
