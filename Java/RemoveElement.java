import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        removeElement(nums, 2);

        for (int i =0 ; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
