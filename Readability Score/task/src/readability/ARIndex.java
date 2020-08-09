package readability;

import readability.utils.TextUtil;
import readability.utils.constants.CountPattern;

public class ARIndex implements ScoreDifficultyAlgorithm {

    @Override
    public double score(TextElementsAnalyzer analyzer) {

        return (4.71 * analyzer.getCharacters() / analyzer.getWords() +
                (0.5 * analyzer.getWords() / analyzer.getSentences()) - 21.43);
    }

    @Override
    public String toString() {
        return "Automated Readability Index";
    }
}
