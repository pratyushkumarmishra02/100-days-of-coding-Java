import java.util.Arrays;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 0; 
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;               
                nums[i] = nums[j];             }
        }
        
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates solution = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 3};
        
        System.out.println("Original Array: " + Arrays.toString(nums));

        int uniqueCount = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + uniqueCount);
        
        System.out.print("The unique array elements are: [");
        for (int k = 0; k < uniqueCount; k++) {
            System.out.print(nums[k]);
            if (k < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}