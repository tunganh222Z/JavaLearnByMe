package learningCallAPI.ultilities;

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

    public static void main(String[] args) {
        String test = new UtilitiesClass().randomText(4);

        System.out.println(test);
    }
}
