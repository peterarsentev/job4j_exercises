package ru.parsentev.task_022;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.parsentev.task_022.Board.Cell.EMPTY;
import static ru.parsentev.task_022.Board.Cell.WIN;

public class BoardTest {
    private final static int SIZE_X = 16;
    private final static int SIZE_Y = 10;
    private final Board.Cell[][] cells = new Board.Cell[SIZE_X][SIZE_Y];
    final Board board = new Board(cells);

    @Before
    public void init() {
        for (int x=0;x!=SIZE_X;++x) {
            for (int y=0;y!=SIZE_Y;++y) {
               this.cells[x][y] = EMPTY;
            }
        }
    }

    @Test
    public void whenFrogBeginInWinCellThenResultTrue() {
        this.cells[0][2] = WIN;
        Board.Way way = board.isWinner(0, 2);
        assertThat(way.isWin(), is(true));
        assertThat(way.getSize(), is(0));
    }

    @Test
    public void whenWinInLineMoveThenFrogGoForward() {
        this.cells[6][2] = WIN;
        boolean result = board.isWinner(0, 2).isWin();
        assertThat(result, is(true));
    }

    @Test
    public void whenWinUp2Forward1MoveThenFrogUp2Forward1() {
        this.cells[1][0] = WIN;
        Board.Way way = board.isWinner(0, 2);
        assertThat(way.isWin(), is(true));
        assertThat(way.getSize(), is(1));
    }

    @Test
    public void whenBoardHasNotWinThenFalse() {
        Board.Way way = board.isWinner(0, 2);
        assertThat(way.isWin(), is(false));
    }

    @Test
    public void whenWinFrogCanGetWinInDiffWayThenTakeMin() {
        this.cells[6][2] = WIN;
        Board.Way way = board.isWinner(0, 2);
        assertThat(way.getSize(), is(2));
    }

    @Test
    public void whenFrogAfterStartThenReloadWay() {
        this.cells[9][6] = WIN;
        Board.Way way = board.isWinner(10, 6);
        assertThat(way.isWin(), is(true));
    }
}