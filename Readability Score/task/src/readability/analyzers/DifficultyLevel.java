package readability.analyzers;

public class DifficultyLevel {
    private static final String[] ageGrade = {
            "6",
            "7",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "24",
            "24+"
    };

    public static String difficultyLevel(double score) {
        int index = (int) Math.round(score);
        return ageGrade[index - 1];
    }
}
