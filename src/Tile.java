public class Tile {

    private int col;
    private int row;
    private TileObject object;

    Tile(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void interact() {
        object.interact();
    }

    public TileObject returnObject() {
        return object;
    }


}
