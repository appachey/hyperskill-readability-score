package readability;

public class TextDifficultyAnalyzer {
    private TextElementsAnalyzer elemAnalyser;

    public TextDifficultyAnalyzer(TextElementsAnalyzer elemAnalyser){
        this.elemAnalyser = elemAnalyser;
    }

    public void analyze(ScoreDifficultyAlgorithm algorithm) {
        double score = algorithm.score(this.elemAnalyser);
        String output = algorithm + ": " + score +
                " (about " + DifficultyLevel.difficultyLevel(score) +
                " year olds).";
        System.out.println(output);
    }
}
