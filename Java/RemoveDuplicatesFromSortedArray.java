import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i =0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        removeDuplicates(nums);

        for (int i =0 ; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }


    public static int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i =1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
