package codingbatjava.warmup.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {

    @Test
    void hasTeen() {
        assertTrue(HasTeen.hasTeen(13,20,10));
        assertTrue(HasTeen.hasTeen(20,19,10));
        assertFalse(HasTeen.hasTeen(1,20,12));
    }
}