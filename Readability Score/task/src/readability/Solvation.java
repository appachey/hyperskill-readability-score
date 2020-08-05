package readability;

public class Solvation {

    public static void main(String[] args) {
        //Main.main(new String[]{"input.txt"});
        String str = "This is the front page of the Simple English Wikipedia. Wikipedias are places where people work together to write encyclopedias in different languages. We use Simple English words and grammar here. The Simple English Wikipedia is for everyone! That includes children and adults who are learning English. There are 142,262 articles on the Simple English Wikipedia. All of the pages are free to use. They have all been published under both the Creative Commons License and the GNU Free Documentation License. You can help here! You may change these pages and make new pages. Read the help pages and other good pages to learn how to write pages here. If you need help, you may ask questions at Simple talk. Use Basic English vocabulary and shorter sentences. This allows people to understand normally complex terms or phrases.";
        ScoreDifficultyAlgorithm scoreFK = new FleschKincaid();
        ScoreDifficultyAlgorithm smogIndex = new SMOGIndex();
        ScoreDifficultyAlgorithm ari = new ARIndex();
        ScoreDifficultyAlgorithm cli = new ColemanLiauIndex();
        System.out.println(ari.scoreInfo(str));
        System.out.println(scoreFK.scoreInfo(str));
        System.out.println(smogIndex.scoreInfo(str));
        System.out.println(cli.scoreInfo(str));
    }
}
