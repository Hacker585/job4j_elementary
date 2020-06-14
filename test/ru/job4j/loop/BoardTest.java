package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void whenBoard() {
        Board.paint(3,3);
    }
}
