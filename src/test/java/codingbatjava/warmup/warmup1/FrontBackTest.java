package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontBackTest {

    @Test
    void frontBack() {
        assertEquals("eodc",FrontBack.frontBack("code"));
        assertEquals("a",FrontBack.frontBack("a"));
        assertEquals("ba",FrontBack.frontBack("ab"));
        assertEquals("cba",FrontBack.frontBack("abc"));
        assertEquals("",FrontBack.frontBack(""));
    }
}