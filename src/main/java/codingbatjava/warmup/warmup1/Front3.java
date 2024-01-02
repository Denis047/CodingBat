package codingbatjava.warmup.warmup1;

/**
 * Given a string, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 */
/*
front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */
public class Front3 {
    public static String front3(String str) {
        String result;
        if (str.length() >= 3) {
            result = str.substring(0, 3);
        } else {
            result = str;
        }
        return result + result + result;
    }

}
