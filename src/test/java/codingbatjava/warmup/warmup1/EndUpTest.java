package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {

    @Test
    void endUp() {
        assertEquals("HeLLO",EndUp.endUp("Hello"));
        assertEquals("hi thERE",EndUp.endUp("hi there"));
        assertEquals("HI",EndUp.endUp("hi"));
        assertEquals("",EndUp.endUp(""));
    }
}