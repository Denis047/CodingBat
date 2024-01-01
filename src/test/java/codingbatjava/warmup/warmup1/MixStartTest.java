package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStartTest {

    @Test
    void mixStart() {
        assertTrue(MixStart.mixStart("mix snacks"));
        assertTrue(MixStart.mixStart("pix snacks"));
        assertFalse(MixStart.mixStart("piz snacks"));
    }
}