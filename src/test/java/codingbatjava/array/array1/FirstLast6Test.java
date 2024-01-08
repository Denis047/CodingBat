package codingbatjava.array.array1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLast6Test {

    @Test
    void firstLast6() {
        assertTrue(FirstLast6.firstLast6(new int[]{1, 2, 3, 4, 5, 6}));
        assertTrue(FirstLast6.firstLast6(new int[]{6, 2, 3, 4, 5, 6}));
        assertTrue(FirstLast6.firstLast6(new int[]{6, 2, 3, 4, 5, 1}));
        assertFalse(FirstLast6.firstLast6(new int[]{2, 3, 4,}));
        assertFalse(FirstLast6.firstLast6(new int[]{2, 6, 3, 4, 5, 1}));
        assertFalse(FirstLast6.firstLast6(new int[]{2, 3, 4, 5, 6, 1}));
    }
}