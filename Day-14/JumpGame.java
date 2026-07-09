public class JumpGame {

    public static boolean canJump(int[] nums) {
        // Keeps track of the furthest index we can currently reach
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] successCase = {2, 4, 0, 0, 0};
        int[] failCase = {3, 2, 1, 0, 4};

        System.out.println("Can jump [2, 4, 0, 0, 0]? " + canJump(successCase));
        System.out.println("Can jump [3, 2, 1, 0, 4]? " + canJump(failCase));        }
}