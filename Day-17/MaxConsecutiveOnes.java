public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++; 
            }

            int currentWindowSize = right - left + 1;
            maxLen = Math.max(maxLen, currentWindowSize);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes solver = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        System.out.println("Test Case 1 Output: " + solver.longestOnes(nums1, k1)); 
        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k2 = 3;
        System.out.println("Test Case 2 Output: " + solver.longestOnes(nums2, k2)); 
    }
}