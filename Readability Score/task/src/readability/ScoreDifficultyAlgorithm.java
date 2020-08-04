package readability;

public interface ScoreDifficultyAlgorithm {
    double score(String text);
    String scoreInfo(String text);
}
