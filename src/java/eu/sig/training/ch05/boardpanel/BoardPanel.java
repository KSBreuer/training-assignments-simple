package eu.sig.training.ch05.boardpanel;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")
    // tag::render[]
    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     *
     * @param square
     *            The square to render.
     * @param g
     *            The graphics context to draw on.
     * @param x
     *            The x position to start drawing.
     * @param y
     *            The y position to start drawing.
     * @param w
     *            The width of this square (in pixels).
     * @param h
     *            The height of this square (in pixels).
     */
    private void render(Square square, Graphics g) {
        square.getSprite().draw(g, square.getStartPoint(), square.getWidth(), square.getHeight());
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, square.getStartPoint(), square.getWidth(), square.getHeight());
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Point startPoint, int w, int h) {

        }
    }

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private class Unit {
        private Point startPoint;

        public Point getStartPoint() {
            return startPoint;
        }

        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        private int width;
        private int height;

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }

        public List<Unit> getOccupants() {
            return null;
        }

    }

}
