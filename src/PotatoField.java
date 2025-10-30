
public class PotatoField {
    private Tile[][] field;

    PotatoField(int numCols, int numRows) {
        field = new Tile[numRows][numCols];

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                field[r][c] = new Tile(r, c);
            }
        }
    }
}


