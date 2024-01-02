package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {

    @Test
    void startOz() {
        assertEquals("oz", StartOz.startOz("ozymandias"));
        assertEquals("z", StartOz.startOz("bzoo"));
        assertEquals("o", StartOz.startOz("oxx"));
        assertEquals("oz", StartOz.startOz("oz"));
        assertEquals("z", StartOz.startOz("zzzz"));
    }
}