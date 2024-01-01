package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {

    @Test
    void or35() {
        assertTrue(Or35.or35(3));
        assertTrue(Or35.or35(10));
        assertTrue(Or35.or35(15));
        assertTrue(Or35.or35(9));
        assertFalse(Or35.or35(8));
        assertFalse(Or35.or35(17));
        assertFalse(Or35.or35(19));
        assertFalse(Or35.or35(-19));
    }
}