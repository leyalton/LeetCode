package leetCode.easy;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int unic = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[unic] < nums[j]){
                nums[unic+1] = nums[j];
                unic++;
            }
        }
        return unic+1;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(array);
    }
}
