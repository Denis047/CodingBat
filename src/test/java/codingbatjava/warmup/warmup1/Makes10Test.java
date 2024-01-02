package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {

    @Test
    void makes10() {
        assertTrue(Makes10.makes10(10,10));
        assertTrue(Makes10.makes10(5,5));
        assertTrue(Makes10.makes10(-5,15));
        assertTrue(Makes10.makes10(3,7));
        assertFalse(Makes10.makes10(-32,555));
        assertFalse(Makes10.makes10(55,5));
        assertFalse(Makes10.makes10(3,8));
        assertFalse(Makes10.makes10(2,4));
    }
}