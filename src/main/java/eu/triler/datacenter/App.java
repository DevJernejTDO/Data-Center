package eu.triler.datacenter;

import java.util.HashMap;
import java.util.Map;

import eu.triler.datacenter.Data.ServerData;
import myTools.FileReader;

public class App {

    public static Map<String, ServerData> ServersMap = new HashMap<>();

    private static App thisApp;
    private static FileReader reader = null;

    public static void main(String[] args) {
        thisApp = new App();
        reader = new FileReader();

        thisApp.loadData();
    }

    public void loadData() {
        String DefaultConfig = getReader().getTextFromFile("config.yml");
    }

    public FileReader getReader() {
        return reader;
    }
}
