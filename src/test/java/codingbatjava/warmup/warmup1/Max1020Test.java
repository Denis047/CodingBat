package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 * or return 0 if neither is in that range.
 */
/*
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
 */
class Max1020Test {

    @Test
    void max1020() {
        assertEquals(12, Max1020.max1020(12, 11));
        assertEquals(15, Max1020.max1020(11, 15));
        assertEquals(19, Max1020.max1020(19, 18));
        assertEquals(0, Max1020.max1020(-12, 111));
        assertEquals(18, Max1020.max1020(11, 18));
    }
}