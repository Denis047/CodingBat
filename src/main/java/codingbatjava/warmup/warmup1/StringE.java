package codingbatjava.warmup.warmup1;

import java.util.Objects;

/**
 * Return true if the given string contains between 1 and 3 'e' chars.
 */
/*
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public static boolean stringE(String str) {
        if (str.isEmpty()) {
            return false;
        }

        int counter = 0;
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'e') {
                counter++;
            }
        }
        return (counter >= 1 && counter <= 3);
    }

}
