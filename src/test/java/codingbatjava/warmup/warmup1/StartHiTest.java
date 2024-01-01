package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {

    @Test
    void startHi() {
        assertTrue(StartHi.startHi("hiasdasdw"));
        assertFalse(StartHi.startHi("asdasdw"));
        assertFalse(StartHi.startHi("ho asdasd"));
        assertFalse(StartHi.startHi("Hi asdasd"));
    }
}