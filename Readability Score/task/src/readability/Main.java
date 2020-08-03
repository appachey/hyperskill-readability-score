package readability;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = ReadUtility.readFile(args[0]);
        TextDificultyAnalyzer textAnalyzer = new TextDificultyAnalyzer(text);
        textAnalyzer.scoreInfo();
    }
}
