package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class ColemanLiauIndex implements ScoreDifficultyAlgorithm{

    @Override
    public double score(TextElementsAnalyzer analyser) {
        double indexL = ((double) analyser.getCharacters() / analyser.getWords()) * 100;
        double indexS = ((double) analyser.getSentences() / analyser.getWords()) * 100;
        return 0.0588 * indexL - 0.296 * indexS - 15.8;
    }

    @Override
    public String toString() {
        return "Coleman–Liau index";
    }
}
