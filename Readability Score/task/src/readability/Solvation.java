package readability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solvation {

    private static final String WORD_PATTERN = "(?m)\\w+,\\w+|\\w+";

    public static void main(String[] args) {
        //Main.main(new String[]{"input.txt"});
        String str = "This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 142,262 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons License and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk. Use Basic English vocabulary and shorter sentences. This allows people to understand normally complex terms or phrases.";
        int sum = 0;
        int polySylCount = 0;
        Pattern pat = Pattern.compile(WORD_PATTERN);
        Matcher match = pat.matcher(str);
        while (match.find()) {
            sum += FleschKincaid.syllabelsCount(match.group());
            if (FleschKincaid.isPolySyllabel(match.group())) {
                polySylCount++;
            }
        }
        System.out.println(sum);
        System.out.println(polySylCount);
    }
}