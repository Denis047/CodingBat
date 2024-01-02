package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {

    @Test
    void intMax() {
        assertEquals(5, IntMax.intMax(1, 2, 5));
        assertEquals(-1, IntMax.intMax(-1, -2, -5));
        assertEquals(500, IntMax.intMax(500, 250, 300));
        assertEquals(0, IntMax.intMax(0, 0, 0));
    }
}