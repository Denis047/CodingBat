package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDoubleTest {

    @Test
    void sumDouble() {
        assertEquals(20, SumDouble.sumDouble(5, 5));
        assertEquals(8, SumDouble.sumDouble(3, 5));
        assertEquals(16, SumDouble.sumDouble(4, 4));
        assertEquals(-4, SumDouble.sumDouble(-1, -1));
        assertEquals(-5, SumDouble.sumDouble(-3, -2));
    }
}