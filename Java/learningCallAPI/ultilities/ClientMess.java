package learningCallAPI.ultilities;

import learningCallAPI.constant.Constant;

public class ClientMess {
    UtilitiesClass utilities;

    private String clientMessFix(){
        return utilities.randomText(6) + "ca1";
    }

    public String setClientMess(String method){
        String clientMess = clientMessFix();

        if (method.equalsIgnoreCase("POST")){
            return Constant.ConstantMethod.POST + clientMess;
        }

        if (method.equalsIgnoreCase("UPDATE")){
            return Constant.ConstantMethod.UPDATE + clientMess;
        }

        if (method.equalsIgnoreCase("PUT")){
            return Constant.ConstantMethod.PUT + clientMess;
        }

        if (method.equalsIgnoreCase("DELETE")){
            return Constant.ConstantMethod.DELETE + clientMess;
        }
        return clientMess;
    }
}
