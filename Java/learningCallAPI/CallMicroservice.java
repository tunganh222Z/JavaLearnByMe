package learningCallAPI;

import learningCallAPI.constant.HttpMethod;
import learningCallAPI.responseClass.ResponseMicroservice;
import learningCallAPI.ultilities.Authentication;
import learningCallAPI.ultilities.ClientMess;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class CallMicroservice {
    ClientMess clientMess = new ClientMess();
    public CallMicroservice(){
    }

    public JSONObject callServiceWithClientMess(String apiPath, String token, HttpMethod method){

        return null;
    }

    public void test(){
        new CallMicroservice().callServiceWithClientMess("test", Authentication.getToken(), HttpMethod.POST);
    }
}
