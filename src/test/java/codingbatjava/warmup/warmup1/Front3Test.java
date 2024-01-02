package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {

    @Test
    void front3() {
        assertEquals("JavJavJav",Front3.front3("Java"));
        assertEquals("ChoChoCho",Front3.front3("Chocolate"));
        assertEquals("abcabcabc",Front3.front3("abcXYZ"));
        assertEquals("aaa",Front3.front3("a"));
        assertEquals("",Front3.front3(""));
    }
}