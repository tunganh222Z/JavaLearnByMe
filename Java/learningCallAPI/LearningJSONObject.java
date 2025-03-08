package learningCallAPI;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import learningCallAPI.constant.Constant;
import learningCallAPI.ultilities.ReadJson;
import learningCallAPI.ultilities.UtilitiesClass;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class LearningJSONObject {
    public static void main(String[] args) throws FileNotFoundException {
//        String jsonFile = Constant.JSON_RESPONSE + "response.json";
        String jsonFile = "Java/learningCallAPI/jsonFolder/jsonResponse/response.json";

        ReadJson readJson = new ReadJson();

        JSONObject jsonObject = readJson.toJSONObject(jsonFile);

        String data = jsonObject.optJSONObject("data").toString();
        String amountCredited = jsonObject.optJSONObject("data").optString("AMOUNT.CREDITED");
        JSONObject dataObject = jsonObject.optJSONObject("data");
        String locEquivChgs = dataObject.optJSONArray("LOC.EQUIV.CHGS").optJSONObject(0).optString("LOC.EQUIV.CHGS");
        System.out.println(locEquivChgs);
    }
    public void test(){
        utilities.randomText(4);
    }
}
