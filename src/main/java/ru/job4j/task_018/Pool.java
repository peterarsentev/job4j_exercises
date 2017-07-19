package ru.job4j.task_018;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class Pool {

    private final int[][] values;
    private final int limit;
    private final boolean[][] visited;

    public Pool(final int[][] values) {
        this.values = values;
        this.limit = values.length;
        this.visited = new boolean[this.limit][this.limit];
    }

    public int maxUnion() {
        int max = 0;
        for (int x=0;x!=this.limit;x++) {
            for (int y=0;y!=this.limit;y++) {
                int result = count(x, y);
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    private int count(int x, int y) {
        int total = 0;
        if (x >= 0 && y >= 0 && x < this.limit && y < this.limit) {
            if (!this.visited[x][y]) {
                this.visited[x][y] = true;
                if (this.values[x][y] == 1) {
                    total++;
                    total += count(x, y - 1);
                    total += count(x + 1, y);
                    total += count(x, y + 1);
                    total += count(x - 1, y);
                }
            }
        }
        return total;
    }
}
