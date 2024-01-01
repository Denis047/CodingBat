package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HearHundredTest {

    @Test
    void nearHundred() {

        assertTrue(HearHundred.nearHundred(90));
        assertTrue(HearHundred.nearHundred(97));
        assertFalse(HearHundred.nearHundred(50));
        assertFalse(HearHundred.nearHundred(-32));
        assertFalse(HearHundred.nearHundred(0));
    }
}