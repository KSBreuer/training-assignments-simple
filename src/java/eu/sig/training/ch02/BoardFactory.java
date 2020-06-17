package eu.sig.training.ch02;

public class BoardFactory {
    // tag::createBoard[]
    public Board createBoard(Square[][] grid) {
        assert grid != null;

        SquareLinker squareLinker = new SquareLinker(grid);
        return squareLinker.generateBoard();
    }
    // end::createBoard[]
}
 class SquareLinker {
    private Board board;
    private Square[][] grid;

    public SquareLinker(Square[][] grid) {
        this.grid = grid;
        this.board = new Board(grid);
    }

    public Board generateBoard() {
        traverseGrid();
        return board;
    }

    private void traverseGrid() {
        for (int x = 0; x < board.getWidth(); x++) {
            for (int y = 0; y < board.getHeight(); y++) {
                linkSquare(x, y);
            }
        }
    }

    private void linkSquare(int x, int y) {
        Square square = grid[x][y];
        for (Direction dir : Direction.values()) {
            int dirX = (board.getWidth() + x + dir.getDeltaX()) % board.getWidth();
            int dirY = (board.getHeight() + y + dir.getDeltaY()) % board.getHeight();
            Square neighbour = grid[dirX][dirY];
            square.link(neighbour, dir);
        }
    }
}

class Board {
    @SuppressWarnings("unused")
    public Board(Square[][] grid) {
    }

    public int getWidth() {
        return 0;
    }

    public int getHeight() {
        return 0;
    }
}

class Square {
    @SuppressWarnings("unused")
    public void link(Square neighbour, Direction dir) {
    }
}

class Direction {

    public static Direction[] values() {
        return null;
    }

    public int getDeltaY() {
        return 0;
    }

    public int getDeltaX() {
        return 0;
    }
}
