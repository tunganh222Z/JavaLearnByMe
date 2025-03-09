package learningCallAPI.responseClass;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.json.JSONObject;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseMicroservice {
}
