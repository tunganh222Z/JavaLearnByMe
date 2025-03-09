package learningCallAPI.constant;

import java.io.File;

public class Constant {
    private static final String fileSeparator = File.separator;
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String JSON_FILE_PATH = PROJECT_PATH + fileSeparator + "learningCallAPI" + fileSeparator + "jsonFolder" + fileSeparator;
    public static final String JSON_RESPONSE = JSON_FILE_PATH  + "jsonResponse" + fileSeparator;


    public class ConstantMethod {
        public static final String POST = "POST";
        public static final String GET = "GET";
        public static final String PATH = "PATH";
        public static final String PUT = "PUT";
        public static final String UPDATE = "UPDATE";
        public static final String DELETE = "DELETE";
    }
}
