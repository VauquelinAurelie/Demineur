package campus.valence.demineur;

public class BombCase  extends Case {
        public BombCase(int x, int y) {
            super(x, y);
        }

        @Override
        public String toString() {
            return "BOMB(" + x + ", " + y + ")";
        }
}
