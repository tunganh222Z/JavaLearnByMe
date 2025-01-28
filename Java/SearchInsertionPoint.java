public class SearchInsertionPoint {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target){
                    index = i;
                } else {
                    if (nums[i] < target){
                        index = i+1;
                    }
                }
            }
            return index;
    }
}
