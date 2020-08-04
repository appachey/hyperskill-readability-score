package readability;

public final class CountPattern {

    public static final String SENTENCE = "(?m)\\p{javaUpperCase}[^.!?]*[.!?]*|\\s+[^.!?]*[.!?]*";
    public static final String WORD = "(?m)\\w+,\\w+|\\w+";
    public static final String CHARACTER = "(?m)\\S+?";

}
