package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class SMOGIndex implements ScoreDifficultyAlgorithm {
    @Override
    public double score(TextElementsAnalyzer analyser) {
        return 1.043 * Math.sqrt((double) analyser.getPolysyllables() * 30 / analyser.getSentences()) + 3.1291;
    }

    @Override
    public String toString() {
        return "Simple Measure of Gobbledygook";
    }
}
