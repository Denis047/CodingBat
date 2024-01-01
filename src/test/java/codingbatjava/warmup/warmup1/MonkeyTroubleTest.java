package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkeyTroubleTest {

    @Test
    void monkeyTrouble() {
        assertTrue(MonkeyTrouble.monkeyTrouble(true, true));
        assertTrue(MonkeyTrouble.monkeyTrouble(false, false));
        assertFalse(MonkeyTrouble.monkeyTrouble(true, false));
    }
}