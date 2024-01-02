package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcyHotTest {

    @Test
    void icyHot() {
        assertTrue(IcyHot.icyHot(120, -1));
        assertFalse(IcyHot.icyHot(-1, 99));
        assertTrue(IcyHot.icyHot(-1, 120));
        assertFalse(IcyHot.icyHot(50, -50));
    }
}