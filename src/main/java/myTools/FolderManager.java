package myTools;

import java.io.File;

public class FolderManager {

    public static void createFolder(String folder, String path) {
        File defaultFolder = new File(path + "/" + folder);
        if (!defaultFolder.exists()) {
            defaultFolder.mkdirs();
            // log
        }
    }
}
