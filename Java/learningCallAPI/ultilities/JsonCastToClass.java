package learningCallAPI.ultilities;

import org.json.JSONObject;

import java.lang.reflect.Field;

public class JsonCastToClass {
    public static <T> T castJsonToClass(JSONObject jsonObject, Class<T> clazz){
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();
            for (Field field : clazz.getDeclaredFields()){
                field.setAccessible(true);
                String fieldName = field.getName();

                if (jsonObject.has(fieldName)){
                    Object value =  jsonObject.get(fieldName);
                    field.set(obj, value);
                }
            }
            return obj;
        } catch (Exception exception){
            exception.printStackTrace();
            return null;
        }

    }
}
