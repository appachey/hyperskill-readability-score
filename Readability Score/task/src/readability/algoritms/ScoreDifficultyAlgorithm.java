package readability.algoritms;

import readability.analyzers.TextElementsAnalyzer;

public interface ScoreDifficultyAlgorithm {
    double score(TextElementsAnalyzer analyzer);
}
