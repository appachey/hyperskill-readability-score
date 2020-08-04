package readability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtil {

    public static int count(String text, String countPattern) {
        int matchCount = 0;
        Pattern pat = Pattern.compile(countPattern);
        Matcher match = pat.matcher(text);
        while (match.find()) {
            matchCount++;
        }
        return matchCount;
    }
}
