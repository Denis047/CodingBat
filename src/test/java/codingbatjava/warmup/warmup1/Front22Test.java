package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front22Test {

    @Test
    void front22() {
        assertEquals("kikittenki", Front22.front22("kitten"));
        assertEquals("aaa", Front22.front22("a"));
        assertEquals("vovot47vo", Front22.front22("vot47"));
        assertEquals("", Front22.front22(""));
        assertEquals("", Front22.front22(null));
    }
}