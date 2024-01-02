package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {

    @Test
    void in1020() {
        assertTrue(In1020.in1020(10, 20));
        assertTrue(In1020.in1020(-15, 13));
        assertTrue(In1020.in1020(16, -20));
        assertFalse(In1020.in1020(21, 30));
        assertFalse(In1020.in1020(-21, -30));
        assertFalse(In1020.in1020(0, 0));
    }
}