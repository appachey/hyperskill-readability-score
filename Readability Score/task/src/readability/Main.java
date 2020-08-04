package readability;

import readability.utils.ReadUtility;

public class Main {
    public static void main(String[] args) {
        String text = ReadUtility.readFile(args[0]);
        TextDificultyAnalyzer textAnalyzer = new TextDificultyAnalyzer(text);
        textAnalyzer.scoreInfo();
    }
}
