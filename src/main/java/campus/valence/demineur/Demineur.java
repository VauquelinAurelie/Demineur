package campus.valence.demineur;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demineur {
    public static Demineur create(int bombCount, int boardSize) {
        //1) generate all bombs
        Set<BombCase> bombes = new HashSet<>();
        Random rand = new Random();
        while (bombes.size() < bombCount) {
            int row = rand.nextInt(boardSize);
            int col = rand.nextInt(boardSize);
            BombCase bombCase = new BombCase(row, col);
            bombes.add(bombCase);
        }

        //2) place the bombs
        Case[][] board = new Case[boardSize][boardSize];
        for (BombCase bomb : bombes) {
            board[bomb.x][bomb.y] = bomb;
        }

        return new Demineur(board);
    }

    private Case[][] board;

    protected Demineur(Case[][] board) {
        this.board = board;
    }

    String boardAsString() {
        return "";
    }

    public Case[][] getBoard() {
        return board;
    }

    public int countBombsAround(int x, int y) {
        throw new RuntimeException("To be implemented");
    }
}
