package codingbatjava.warmup.warmup1;

import java.util.Objects;

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 */
/*
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class FrontBack {

    public static String frontBack(String str) {
        if (Objects.nonNull(str)) {
            if (str.length() <= 1) {
                return str;
            }
            return String.valueOf(str.charAt(str.length() - 1)) + str.substring(1, str.length() - 1) + String.valueOf(str.charAt(0));
        }
        return "";
    }

}
