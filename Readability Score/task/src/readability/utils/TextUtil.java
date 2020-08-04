package readability.utils;

import readability.utils.constants.CountPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtil {

    private static boolean isVowel(char ch) {
        char lCaseCh = Character.toLowerCase(ch);
        return lCaseCh == 'a' || lCaseCh == 'e' || lCaseCh == 'i'
                || lCaseCh == 'o' || lCaseCh == 'u' || lCaseCh == 'y';
    }

    private static int wordSyllabelsCount(String word) {
        int count = 0;
        boolean isPrevVowel = false;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i)) && !isVowel(word.charAt(i)) == isPrevVowel) {
                count++;
                isPrevVowel = isVowel(word.charAt(i));
            } else {
                isPrevVowel = isVowel(word.charAt(i));
            }
        }
        if (word.charAt(word.length() - 1) == 'e') {
            count--;
        }

        return count == 0 ? 1 : count;
    }

    public static int allSyllablesCount(String text) {
        int syllablesSum = 0;
        Pattern pat = Pattern.compile(CountPattern.WORD);
        Matcher match = pat.matcher(text);
        while (match.find()) {
            syllablesSum += wordSyllabelsCount(match.group());
        }
        return syllablesSum;
    }

    private static boolean isPolySyllabel(String word) {
        return wordSyllabelsCount(word) > 2;
    }

    public static int polySyllabelCount(String text) {
        int polySylCount = 0;
        Pattern pat = Pattern.compile(CountPattern.WORD);
        Matcher match = pat.matcher(text);
        while (match.find()) {
            if (isPolySyllabel(match.group())) {
                polySylCount++;
            }
        }
        return polySylCount;
    }

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
