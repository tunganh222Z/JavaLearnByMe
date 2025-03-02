package learningCallAPI.ultilities;


import com.fasterxml.jackson.databind.ObjectMapper;
import learningCallAPI.requestClass.RequestMicroservice;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static learningCallAPI.constant.Constant.JSON_FILE_PATH;

public class ReadJson {
    public RequestMicroservice readJsonFile (String fileName){
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = JSON_FILE_PATH +fileName;
        try {
            File file = new File(filePath);
            return objectMapper.readValue(file, RequestMicroservice.class);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
       return null;
    }

    public Map<String, Object> jsonToHashMap (String filePath) { // using jackson
        Map<String, Object> data;
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            data = objectMapper.readValue(new File(filePath), Map.class);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        return data;
    }

    public JSONObject toJSONObject(String filePath){
        JSONObject jsonObject;
        try {
            String contentJson = new String(Files.readAllBytes(Paths.get(filePath)));

            jsonObject = new JSONObject(contentJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
}
