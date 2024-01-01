package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    @Test
    void diff21() {

        assertEquals(2, Diff21.diff21(19));
        assertEquals(10, Diff21.diff21(11));
        assertEquals(0, Diff21.diff21(21));
        assertEquals(6,Diff21.diff21(15));
    }
}