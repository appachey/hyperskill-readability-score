package readability;

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
}
