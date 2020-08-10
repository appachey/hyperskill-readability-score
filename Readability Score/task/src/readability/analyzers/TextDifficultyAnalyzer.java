package readability.analyzers;

import readability.algoritms.ScoreDifficultyAlgorithm;

public class TextDifficultyAnalyzer {

    public void analyze(String text, ScoreDifficultyAlgorithm algorithm) {
        TextElementsAnalyzer elemAnalyser = new TextElementsAnalyzer(text);
        double score = algorithm.score(elemAnalyser);
        String output = algorithm + ": " + score +
                " (about " + DifficultyLevel.difficultyLevel(score) +
                " year olds).";
        System.out.println(output);
    }
}
