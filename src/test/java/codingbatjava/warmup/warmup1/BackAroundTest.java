package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {

    @Test
    void backAround() {
        assertEquals("tcatt",BackAround.backAround("cat"));
        assertEquals("oHelloo",BackAround.backAround("Hello"));
        assertEquals("aaa",BackAround.backAround("a"));
        assertEquals("cabcc",BackAround.backAround("abc"));
    }
}