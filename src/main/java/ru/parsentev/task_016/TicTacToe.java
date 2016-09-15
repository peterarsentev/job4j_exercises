package ru.parsentev.task_016;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class TicTacToe {
    private static final Logger LOG = getLogger(TicTacToe.class);
    private static final int START = 1;

    private final int[][] values;

    public TicTacToe(final int[][] values) {
        this.values = values;
    }

    public boolean hasWinner() {
        boolean result = false;
        for (int x=0;x<this.values.length;x++) {
            for (int y=0;y<this.values.length;y++) {
                if (this.traversal(x, y, START, 0, 1) ||
                        this.traversal(x, y, START, 1, 0) ||
                        this.traversal(x, y, START, 1, 1)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean traversal(int x, int y, int count, int stepX, int stepY) {
        boolean result = false;
        if (count == 3) {
            result = true;
        } else {
            if (x + stepX < this.values.length && y + stepY < this.values.length &&
                    this.values[x][y] == this.values[x + stepX][y + stepY]) {
                result = this.traversal(x + stepX, y + stepY, count + 1, stepX, stepY);
            }
        }
        return result;
    }
}
