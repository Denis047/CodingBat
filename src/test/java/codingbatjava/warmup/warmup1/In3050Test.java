package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {

    @Test
    void in3050() {

        assertTrue(In3050.in3050(30, 31));
        assertFalse(In3050.in3050(30, 41));
        assertFalse(In3050.in3050(40, 51));
        assertTrue(In3050.in3050(40, 39));
        assertFalse(In3050.in3050(35, 45));

    }
}