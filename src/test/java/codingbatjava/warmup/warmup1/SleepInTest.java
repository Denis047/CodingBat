package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    @Test
    void sleepIn() {
        assertTrue(SleepIn.sleepIn(false, false));
        assertFalse(SleepIn.sleepIn(true, false));
        assertTrue(SleepIn.sleepIn(false, true));
    }
}