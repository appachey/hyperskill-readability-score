package readability.analyzers;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class TextElementsAnalyzer {
    private String text;
    private int words;
    private int characters;
    private int sentences;
    private int syllabels;
    private int polysyllables;

    public TextElementsAnalyzer(String text) {
        this.text = text;
        words = TextUtil.count(this.text, CountPattern.WORD);
        characters = TextUtil.count(this.text, CountPattern.CHARACTER);
        sentences = TextUtil.count(this.text, CountPattern.SENTENCE);
        syllabels = TextUtil.allSyllablesCount(this.text);
        polysyllables = TextUtil.polySyllabelCount(this.text);
    }

    public String getText() {
        return text;
    }

    public int getWords() {
        return words;
    }

    public int getCharacters() {
        return characters;
    }

    public int getSentences() {
        return sentences;
    }

    public int getSyllabels() {
        return syllabels;
    }

    public int getPolysyllables() {
        return polysyllables;
    }

    @Override
    public String toString() {
        return "The text is:" + System.lineSeparator() +
                this.text +
                System.lineSeparator() +
                System.lineSeparator() +
                "Words: " + words + System.lineSeparator() +
                "Sentences: " + sentences + System.lineSeparator() +
                "Characters: " + characters + System.lineSeparator() +
                "Syllables: " + syllabels + System.lineSeparator() +
                "Polysyllables: " + polysyllables;
    }
}
