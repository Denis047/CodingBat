package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingCharTest {
    /*
    missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
     */
    @Test
    void missingChar() {
        assertEquals("ktten",MissingChar.missingChar("kitten",1));
        assertEquals("itten",MissingChar.missingChar("kitten",0));
        assertEquals("kittn",MissingChar.missingChar("kitten",4));
        assertEquals("cod",MissingChar.missingChar("code",3));
        assertEquals("chocolat",MissingChar.missingChar("chocolate",8));
        assertEquals("H",MissingChar.missingChar("Hi",1));
    }
}