package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class NotStringTest {

    @Test
    void notString() {
        assertEquals("not candy", NotString.notString("candy"));
        assertEquals("not x", NotString.notString("x"));
        assertEquals("not increment", NotString.notString("increment"));
        assertEquals("not increment", NotString.notString("not increment"));

    }
}