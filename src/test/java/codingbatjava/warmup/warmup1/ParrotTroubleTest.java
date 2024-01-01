package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTroubleTest {

    @Test
    void parrotTrouble() {
        assertTrue(ParrotTrouble.parrotTrouble(true, 6));
        assertFalse(ParrotTrouble.parrotTrouble(true, 7));
        assertFalse(ParrotTrouble.parrotTrouble(false, 7));
    }
}