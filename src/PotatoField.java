
public class PotatoField {
    private Tile[][] field;
    int numRows;
    int numCols;

    PotatoField(int numCols, int numRows) {
        field = new Tile[numRows][numCols];
        this.numCols = numCols;
        this.numRows = numRows;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                field[r][c] = new Tile(r, c);
            }
        }
    }

    public Tile getTile(int row, int col) {
        return field[row][col];
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }
}


