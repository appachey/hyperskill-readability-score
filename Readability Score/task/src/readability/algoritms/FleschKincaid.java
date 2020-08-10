package readability.algoritms;

import readability.analyzers.TextElementsAnalyzer;

public class FleschKincaid implements ScoreDifficultyAlgorithm {

    @Override
    public double score(TextElementsAnalyzer analyzer) {
        return 0.39 * ((double) analyzer.getWords() / analyzer.getSentences()) +
                11.8 * ((double) analyzer.getSyllabels() / analyzer.getWords()) - 15.59;
    }

    @Override
    public String toString() {
        return "Flesch–Kincaid readability tests";
    }
}
