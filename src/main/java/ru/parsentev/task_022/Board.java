package ru.parsentev.task_022;

public class Board {
    private static final int LIMIT = 5;
    private final Cell[][] cells;
    private final int size_x;
    private final int size_y;
    private final Step[] directs = {
            new Step(1, -2),
            new Step(2, -1),
            new Step(3, 0),
            new Step(2, 1),
            new Step(1, 2)
    };

    public Board(final Cell[][] cells) {
        this.cells = cells;
        this.size_x = cells.length;
        this.size_y = cells[0].length;
    }

    public Way isWinner(int x, int y) {
        return this.isWinner(x, y, 0);
    }

    private Way isWinner(int x, int y, int stepCount) {
        Way result = new Way(false, stepCount);
        if (stepCount <= LIMIT && x >= 0 && y >= 0 && y < this.size_y) {
            if (x >= this.size_x) {
                x -= this.size_x;
            }
            if (this.cells[x][y] == Cell.WIN) {
                result = new Way(true, stepCount);
            } else if (this.cells[x][y] != Cell.TREE) {
                for (Step step : this.directs) {
                    Way way = this.isWinner(x + step.x, y + step.y, stepCount + 1);
                    if (way.win && (!result.win || result.size > way.size)) {
                        result = way;
                    }
                }
            }
        }
        return result;
    }

    public static final class Way {
        private final int size;
        private final boolean win;

        public Way(final boolean win, final int size) {
            this.win = win;
            this.size = size;
        }

        public boolean isWin() {
            return this.win;
        }

        public int getSize() {
            return this.size;
        }
    }

    private static final class Step {
        private final int x;
        private final int y;

        private Step(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


    public enum Cell {
        WIN, EMPTY, TREE
    }
}
