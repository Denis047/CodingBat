package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EveryNthTest {

    @Test
    void everyNth() {
        assertEquals("Mrce", EveryNth.everyNth("Miracle", 2));
        assertEquals("aceg", EveryNth.everyNth("abcdefg", 2));
        assertEquals("adg", EveryNth.everyNth("abcdefg", 3));
    }
}