public class FindGcdOfArray {

    public int findGCD(int[] nums) {
        int s = nums[0], l = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < s) {
                s = nums[i];
            }
            if (nums[i] > l) {
                l = nums[i];
            }
        }
        int gcd = GCD(s, l);
        return gcd;
    }

    public int GCD(int s, int l) {
        while (l != 0) {
            int remainder = s % l;
            s = l;
            l = remainder;
        }
        return s;
    }

    public static void main(String[] args) {
        FindGcdOfArray solver = new FindGcdOfArray();

        int[] nums1 = {2, 5, 6, 9, 10};
        System.out.println("Test Case 1 Output: " + solver.findGCD(nums1)); 

        int[] nums2 = {7, 5, 6, 8, 3};
        System.out.println("Test Case 2 Output: " + solver.findGCD(nums2)); 
        
        int[] nums3 = {3, 3};
        System.out.println("Test Case 3 Output: " + solver.findGCD(nums3)); 
    }
}