package readability;

import java.util.Formatter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextDificultyAnalyzer {
    private final String text;
    private static final String SENTENCE_PATTERN = "(?m)\\p{javaUpperCase}[^.!?]*[.!?]*|\\s+[^.!?]*[.!?]*";
    private static final String WORD_PATTERN = "(?m)\\w+,\\w+|\\w+";
    private static final String CHARACTER_PATTERN = "(?m)\\S+?";

    public TextDificultyAnalyzer(String text) {
        this.text = text;
    }

    private int sentenceCount(String pattern) {
        int matchCount = 0;
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(text);
        while (match.find()) {
            matchCount++;
        }
        return matchCount;
    }

    private double score() {
        return (4.71 * sentenceCount(CHARACTER_PATTERN) / sentenceCount(WORD_PATTERN) +
                (0.5 * sentenceCount(WORD_PATTERN) / sentenceCount(SENTENCE_PATTERN)) - 21.43);
    }

    public void scoreInfo() {
        System.out.println("Words: " + sentenceCount(WORD_PATTERN));
        System.out.println("Sentences: " + sentenceCount(SENTENCE_PATTERN));
        System.out.println("Characters: " + sentenceCount(CHARACTER_PATTERN));
        Formatter formatter = new Formatter(Locale.UK);
        formatter.format("The score is: %.2f\n", score());
        System.out.println(formatter);
        DifficultyLevel.difficultyLevel(score());
    }

}
