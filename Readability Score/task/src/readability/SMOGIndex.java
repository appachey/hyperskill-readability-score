package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class SMOGIndex implements ScoreDifficultyAlgorithm {
    @Override
    public double score(String text) {
        int polysyllabels = TextUtil.polySyllabelCount(text);
        int sentences = TextUtil.count(text, CountPattern.SENTENCE);
        return 1.043 * Math.sqrt((double) polysyllabels * 30 / sentences) + 3.1291;
    }

    @Override
    public String scoreInfo(String text) {
        double score = this.score(text);
        return "Simple Measure of Gobbledygook: " +
                score + " (about " +
                DifficultyLevel.difficultyLevel(score) +
                " year old).";
    }
}
