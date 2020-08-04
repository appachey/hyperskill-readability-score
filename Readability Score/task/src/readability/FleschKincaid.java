package readability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FleschKincaid {

    public static boolean isVowel(char ch) {
        char lCaseCh = Character.toLowerCase(ch);
        return lCaseCh == 'a' || lCaseCh == 'e' || lCaseCh == 'i'
                || lCaseCh == 'o' || lCaseCh == 'u' || lCaseCh == 'y';
    }

    public static int syllabelsCount(String word) {
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

    public static boolean isPolySyllabel(String word) {
        return syllabelsCount(word) > 2;
    }

    public static double score(String text) {
        int wordsCount = TextUtil.count(text, CountPattern.WORD);
        int sentencesCount = TextUtil.count(text, CountPattern.SENTENCE);
        int syllablesSum = 0;
        Pattern pat = Pattern.compile(CountPattern.WORD);
        Matcher match = pat.matcher(text);
        while (match.find()) {
            syllablesSum += syllabelsCount(match.group());

        }
        return 0.39 * ((double) wordsCount / sentencesCount) + 11.8 * ((double) syllablesSum / wordsCount) - 15.59;
    }
}
