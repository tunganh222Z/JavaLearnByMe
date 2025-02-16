package learningCallAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import learningCallAPI.responseClass.ResponseMicroservice;

import static io.restassured.RestAssured.given;

public class CallMicroservice {
    public CallMicroservice(){

    }
//    public ResponseMicroservice call(){
//        RestAssured.baseURI = "123";
//        RequestSpecification request = given();
//        request.head("Accept", "application/json");
//        Response response = request.get();
//        return response.then().extract().as(ResponseMicroservice.class);
//    }
}
