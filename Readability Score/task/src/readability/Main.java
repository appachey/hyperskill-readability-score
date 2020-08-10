package readability;

import readability.algoritms.ARIndex;
import readability.algoritms.ColemanLiauIndex;
import readability.algoritms.FleschKincaid;
import readability.algoritms.SMOGIndex;
import readability.analyzers.TextDifficultyAnalyzer;
import readability.analyzers.TextElementsAnalyzer;
import readability.utils.ReadUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = ReadUtility.readFile(args[0]);
        TextElementsAnalyzer elemAnalyser = new TextElementsAnalyzer(text);
        System.out.println(elemAnalyser);
        TextDifficultyAnalyzer difficultyAnalyzer = new TextDifficultyAnalyzer();
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        String algorithm = scan.next();
        System.out.println();
        switch (algorithm) {
            case "ARI":
                difficultyAnalyzer.analyze(text, new ARIndex());
                break;
            case "FK":
                difficultyAnalyzer.analyze(text, new FleschKincaid());
                break;
            case "SMOG":
                difficultyAnalyzer.analyze(text, new SMOGIndex());
                break;
            case "CL":
                difficultyAnalyzer.analyze(text, new ColemanLiauIndex());
                break;
            case "all":
                difficultyAnalyzer.analyze(text, new ARIndex());
                difficultyAnalyzer.analyze(text, new FleschKincaid());
                difficultyAnalyzer.analyze(text, new SMOGIndex());
                difficultyAnalyzer.analyze(text, new ColemanLiauIndex());
                break;
        }
    }
}
