package learningCallAPI.ultilities;


import com.fasterxml.jackson.databind.ObjectMapper;
import learningCallAPI.requestClass.RequestMicroservice;

import java.io.File;
import java.io.IOException;

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
}
