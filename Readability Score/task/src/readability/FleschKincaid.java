package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class FleschKincaid implements ScoreDifficultyAlgorithm{

    @Override
    public double score(String text) {
        int wordsCount = TextUtil.count(text, CountPattern.WORD);
        int sentencesCount = TextUtil.count(text, CountPattern.SENTENCE);
        int syllablesSum = TextUtil.allSyllablesCount(text);
        return 0.39 * ((double) wordsCount / sentencesCount) +
                11.8 * ((double) syllablesSum / wordsCount) - 15.59;
    }

    @Override
    public String scoreInfo(String text) {
        double score = this.score(text);
        return "Flesch–Kincaid readability tests: " +
                score + " (about " +
                DifficultyLevel.difficultyLevel(score) +
                " year olds).";
    }
}
