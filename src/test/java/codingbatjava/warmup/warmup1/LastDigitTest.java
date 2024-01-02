package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {

    @Test
    void lastDigit() {
        assertTrue(LastDigit.lastDigit(15, 5));
        assertTrue(LastDigit.lastDigit(37, 17));
        assertTrue(LastDigit.lastDigit(65, 105));
        assertFalse(LastDigit.lastDigit(114, 113));
        assertFalse(LastDigit.lastDigit(6, 17));
    }
}