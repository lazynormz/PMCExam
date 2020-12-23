package dk.mlwinum;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static final String TEST_PATH = "/home/jagd/Projects/Java/xamprj/test_data/";

    public static void main(String[] args) {
        String path = TEST_PATH + "Y2K, bbno$ - Wawawa (Official Video).mp4";
        File file = new File(path);

        if (!file.exists())
            throw new RuntimeException("File not found");

        if (!file.getName().endsWith(".mp4"))
            throw new RuntimeException("File type not supported. Use mp4");

        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
