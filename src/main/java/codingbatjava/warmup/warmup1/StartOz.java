package codingbatjava.warmup.warmup1;


/**
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 */
/*
startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class StartOz {

    public static String startOz(String str) {
        StringBuilder sb = new StringBuilder("");
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            sb.append(str.charAt(0));
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            sb.append(str.charAt(1));
        }
        return sb.toString();
    }

}
