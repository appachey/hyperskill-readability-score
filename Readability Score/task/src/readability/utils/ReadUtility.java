package readability.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadUtility {
    public static String readFile(String inputFileName) {
        String output = null;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(inputFileName));
            output = new String(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }
}
