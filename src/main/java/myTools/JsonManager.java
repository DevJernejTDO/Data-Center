package myTools;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonManager {
	
	public static void createJsonFile(String fileName, JsonObject object, String path) {
		File file = new File(path+"/"+fileName+".json");
		if(!file.exists()) {
			try {
				FileWriter writer = new FileWriter(file);
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				writer.write(gson.toJson(object));
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static JsonObject getJsonBody(String fileName, String path) {
		File tempFile = new File(path+"/"+fileName+".json");
		if(tempFile.exists()) {
			try (Reader reader = new FileReader(tempFile)) {
				JsonObject jsonObject = (JsonObject) JsonParser.parseReader(reader);
				return jsonObject;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		return null;
	}

	public static void updateJsonBody(String fileName, JsonObject object, String path) {
		File tempFile = new File(path+"/"+fileName+".json");
		if(tempFile.exists()) {
			try {
				FileWriter file = new FileWriter(tempFile);
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				file.write(gson.toJson(object));		
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
