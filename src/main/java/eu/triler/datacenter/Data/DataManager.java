package eu.triler.datacenter.Data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import eu.triler.datacenter.App;
import myTools.FileReader;
import myTools.JsonManager;

public class DataManager {

    public void CreateLocalFiles() {
        App myApp = App.getApp();
        FileReader reader = myApp.getReader();
        JsonManager json = myApp.getJsonManager();

        // Gett all defauld files
        String defauldConfig = reader.getTextFromFile("config.json");
        System.out.println(defauldConfig);
        // Set string to JSON
        JsonObject defaultConfigObject = (JsonObject) JsonParser.parseString(defauldConfig);

        // Create Files
        json.createJsonFile("config", defaultConfigObject, myApp.getPath());
    }

}
