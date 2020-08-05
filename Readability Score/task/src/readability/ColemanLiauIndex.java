package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class ColemanLiauIndex implements ScoreDifficultyAlgorithm{

    @Override
    public double score(String text) {
        int characters = TextUtil.count(text, CountPattern.CHARACTER);
        int words = TextUtil.count(text, CountPattern.WORD);
        int sentences = TextUtil.count(text, CountPattern.SENTENCE);
        double indexL = ((double) characters / words) * 100;
        double indexS = ((double) sentences / words) * 100;
        return 0.0588 * indexL - 0.296 * indexS - 15.8;
    }

    @Override
    public String scoreInfo(String text) {
        double score = this.score(text);
        return "Coleman–Liau index: " +
                score + " (about " +
                DifficultyLevel.difficultyLevel(score) +
                " year olds).";
    }
}
