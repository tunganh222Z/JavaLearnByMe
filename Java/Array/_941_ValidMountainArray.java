package Array;

public class _941_ValidMountainArray {
    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) { //3ms
        boolean validMountain = false;
        boolean up = false;
        boolean down = false;
        if (arr.length < 3){
            return false;
        } else {
            boolean peak = false;

            for (int i = 1; i < arr.length; i++){

                if (arr[i] < arr[i-1]){
                    peak = true;
                }
                if (arr[i] > arr[i-1] && peak == false){
                    up = true;
                } else if (arr[i] < arr[i-1] && peak == true) {
                    down = true;
                } else {
                    return false;
                }
            }
        }
        if (up && down){
            return true;
        }
        return validMountain;
    }
}
