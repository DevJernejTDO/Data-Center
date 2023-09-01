package myTools;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileReader {

    public static String getTextFromFile(String fileName) {
        ClassLoader classLoader = FileReader.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        String data = null;
        try {
            data = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        ;

        return data;
    }
}
