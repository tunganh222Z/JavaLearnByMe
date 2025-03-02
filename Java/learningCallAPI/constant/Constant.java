package learningCallAPI.constant;

import java.io.File;

public class Constant {
    private static final String fileSeparator = File.separator;
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String JSON_FILE_PATH = PROJECT_PATH + fileSeparator + "learningCallAPI" + fileSeparator + "jsonFolder" + fileSeparator;
    public static final String JSON_RESPONSE = JSON_FILE_PATH  + "jsonResponse" + fileSeparator;
}
