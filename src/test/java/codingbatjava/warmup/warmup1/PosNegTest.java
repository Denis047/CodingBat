package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosNegTest {

    @Test
    void posNeg() {
        assertTrue(PosNeg.posNeg(1,-1,false));
        assertTrue(PosNeg.posNeg(-1,1,false));
        assertTrue(PosNeg.posNeg(-4,-5,true));
        assertFalse(PosNeg.posNeg(-4,-5,false));
    }
}