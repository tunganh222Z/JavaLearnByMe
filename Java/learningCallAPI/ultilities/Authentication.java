package learningCallAPI.ultilities;

public class Authentication {
    private String token;

    public Authentication(){
        this.token = "000000";
    }

    public static String getToken(){
        return new Authentication().toString();
    }
}
