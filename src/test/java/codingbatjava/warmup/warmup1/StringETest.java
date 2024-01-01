package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringETest {

    @Test
    void stringE() {
        assertTrue(StringE.stringE("Hello"));
        assertTrue(StringE.stringE("Heelle"));
        assertFalse(StringE.stringE("Heelele"));
        assertFalse(StringE.stringE("Hll"));
        assertTrue(StringE.stringE("e"));
        assertFalse(StringE.stringE(""));
    }
}