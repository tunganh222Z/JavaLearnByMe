package HashTable_SetMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _217_ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        _217_ContainsDuplicate test = new _217_ContainsDuplicate();

        System.out.println(test.containsDuplicate1(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (mySet.contains(nums[i])){
                return true;
            } else {
                mySet.add(nums[i]);
            }
        }
        return false;
    }

    public boolean containsDuplicate1 (int[] nums) { // time limit exceeded

        for (int i =0; i < nums.length; i++){
            for (int j =i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate2 (int[] nums) {// 1ms reference
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
            temp = nums[i];
            if (nums[i] < nums[i - 1]) {
                // nếu num tại index i nhỏ hơn num tại index i phía sau thì duyệt ngược trở lại tìm dup
                for (int j = i - 2; j >= 0; j--) {
                    if (nums[j] == temp) {
                        return true;
                    }
                }
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        return false;
    }
}
