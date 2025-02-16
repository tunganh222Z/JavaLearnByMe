package Array;

import java.util.Scanner;

public class _1051_HeightChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }

        _1051_HeightChecker test = new _1051_HeightChecker();

        System.out.println(test.heightChecker(heights));
    }
    /*
    Input: heights = [1,1,4,2,1,3]
    Output: 3
    Explanation:
    heights:  [1,1,4,2,1,3]
    expected: [1,1,1,2,3,4]
    Indices 2, 4, and 5 do not match.
     */
    public int heightChecker(int[] heights) { //2ms beats 88.78%
        int count = 0;

        int[] expectedHeight = new int[heights.length];
        for (int j = 0; j < heights.length; j++){
            expectedHeight[j] = heights[j];
        }
        selectionSort(expectedHeight);

        for (int i = 0; i < heights.length; i++){
            if (heights[i] != expectedHeight[i]){
                count++;
            }
        }
        return count;
    }

    public void selectionSort(int[] array){
        for (int i = 0; i< array.length; i++){
            int minIndex = i;
            for (int j = i+1; j < array.length; j++ ){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
