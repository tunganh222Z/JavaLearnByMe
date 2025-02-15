package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _1299_ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        _1299_ReplaceElementsWithGreatestElementOnRightSide test = new _1299_ReplaceElementsWithGreatestElementOnRightSide();

        System.out.println(Arrays.toString(test.replaceElements(arr)));
    }
    /*
    Input: arr = [17,18,5,4,6,1]
    Output: [18,6,6,6,1,-1]
    Explanation:
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
     */
    public int[] replaceElements(int[] arr) { // 2ms beat 97%
        int maxElement = 0;
        int pointer = 1;
        int i = 0;

        while (pointer < arr.length){
            maxElement = arr[pointer];
            for (int j = pointer; j < arr.length; j++){
                if (arr[j] > maxElement){
                    maxElement = arr[j];
                    pointer = j;
                }
            }
            while (i < pointer){

                arr[i] = maxElement;
                i++;
            }
            pointer++;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
