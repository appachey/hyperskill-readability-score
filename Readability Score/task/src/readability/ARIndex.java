package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class ARIndex implements ScoreDifficultyAlgorithm {

    @Override
    public double score(String text) {
        int characters = TextUtil.count(text, CountPattern.CHARACTER);
        int words = TextUtil.count(text, CountPattern.WORD);
        int sentences = TextUtil.count(text, CountPattern.SENTENCE);
        return (4.71 * characters / words + (0.5 * words / sentences) - 21.43);
    }

    @Override
    public String scoreInfo(String text) {
        double score = this.score(text);
        return "Automated Readability Index: " +
                score + " (about " +
                DifficultyLevel.difficultyLevel(score) +
                " year olds).";
    }

}
