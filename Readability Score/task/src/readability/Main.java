package readability;

import readability.utils.ReadUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = ReadUtility.readFile(scan.nextLine());
        TextElementsAnalyzer elemAnalyser = new TextElementsAnalyzer(text);
        System.out.println(elemAnalyser);
        TextDifficultyAnalyzer difficultyAnalyzer = new TextDifficultyAnalyzer(elemAnalyser);
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        String algorithm = scan.next();
        System.out.println();
        switch (algorithm) {
            case "ARI":
                difficultyAnalyzer.analyze(new ARIndex());
                break;
            case "FK":
                difficultyAnalyzer.analyze(new FleschKincaid());
                break;
            case "SMOG":
                difficultyAnalyzer.analyze(new SMOGIndex());
                break;
            case "CL":
                difficultyAnalyzer.analyze(new ColemanLiauIndex());
                break;
            case "all":
                difficultyAnalyzer.analyze(new ARIndex());
                difficultyAnalyzer.analyze(new FleschKincaid());
                difficultyAnalyzer.analyze(new SMOGIndex());
                difficultyAnalyzer.analyze(new ColemanLiauIndex());
                break;
        }
    }
}
