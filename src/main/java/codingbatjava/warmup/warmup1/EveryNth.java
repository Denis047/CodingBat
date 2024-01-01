package codingbatjava.warmup.warmup1;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a non-empty string and an int N, return the string made starting with char 0,
 * and then every Nth char of the string.
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 */
/*
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class EveryNth {
    public static String everyNth(String str, int n) {

//        return IntStream.range(0, str.length())
//                .filter(i -> i % 3 == 0)
//                .mapToObj(str::charAt)
//                .map(String::valueOf)
//                .collect(Collectors.joining());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i += n) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

}
