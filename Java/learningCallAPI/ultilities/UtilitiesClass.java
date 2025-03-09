package learningCallAPI.ultilities;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UtilitiesClass {

    public String randomText(int size){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random random = new Random();

        int characterLength = characters.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++){
            int index = random.nextInt(characterLength);

            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public Map<String, Object> convertToHashMap(Object object){
        Map<String, Object> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();
        try {
            for (Field field : fields){
                field.setAccessible(true);

                map.put(field.getName(), field.get(object));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }

    public static void main(String[] args) {
        String test = new UtilitiesClass().randomText(4);

        System.out.println(test);
    }
}
