package eu.triler.datacenter;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import eu.triler.datacenter.Data.DataManager;
import eu.triler.datacenter.Data.ServerData;
import myTools.FileReader;
import myTools.JsonManager;

public class App {

    public static Map<String, ServerData> ServersMap = new HashMap<>();

    private static App thisApp;
    private static DataManager dataManager = null;
    private static FileReader reader = null;
    private static JsonManager jsonManager = null;
    private static String mainPath = null;

    public static void main(String[] args) {
        thisApp = new App();
        dataManager = new DataManager();
        reader = new FileReader();
        jsonManager = new JsonManager();
        mainPath = (new File("").getAbsolutePath());

        getApp().getDataManager().CreateLocalFiles();
    }

    public static App getApp() {
        return thisApp;
    }

    public DataManager getDataManager() {
        return dataManager;
    }

    public FileReader getReader() {
        return reader;
    }

    public JsonManager getJsonManager() {
        return jsonManager;
    }

    public String getPath() {
        return mainPath;
    }
}
