package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    @Test
    void close10() {
        assertEquals(Close10.close10(8, 13), 8);
        assertEquals(Close10.close10(13, 8), 8);
        assertEquals(Close10.close10(9, 13), 9);
        assertEquals(Close10.close10(10, 10), 0);

    }
}