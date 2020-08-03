package readability;

public class DifficultyLevel {
    private static final String[] ageGrade = {
            "5-6",
            "6-7",
            "7-9",
            "9-10",
            "10-11",
            "11-12",
            "12-13",
            "13-14",
            "14-15",
            "15-16",
            "16-17",
            "17-18",
            "18-24",
            "24+"
    };

    public static void difficultyLevel(double score) {
        int index = (int) Math.ceil(score);
        System.out.println("This text should be understood by " + ageGrade[index - 1] + " year olds.");
    }

}
