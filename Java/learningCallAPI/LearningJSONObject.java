package learningCallAPI;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import learningCallAPI.constant.Constant;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearningJSONObject {
    public static void main(String[] args) throws FileNotFoundException {
        String jsonFile = Constant.JSON_FILE_PATH + File.separator + "jsonResponse" +File.separator + "jsonResponse.json";
        FileReader file = new FileReader(jsonFile);



    }
}
