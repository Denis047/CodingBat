package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    @Test
    void delDel() {
        assertEquals("abc",DelDel.delDel("adelbc"));
        assertEquals("abcdel",DelDel.delDel("abcdel"));
        assertEquals("",DelDel.delDel(""));
        assertEquals("del",DelDel.delDel("del"));
        assertEquals("a",DelDel.delDel("adel"));
    }
}