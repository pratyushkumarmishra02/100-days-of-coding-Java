import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, max_len = 0;
        Set<Character> set = new HashSet<>();
        
        while (end < s.length()) {
            char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                end++;
                max_len = Math.max(max_len, set.size());
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_len;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating solver = new LongestSubstringWithoutRepeating();

        String test1 = "abcabcbb";
        System.out.println("Test Case 1 Output: " + solver.lengthOfLongestSubstring(test1)); 

        String test2 = "bbbbb";
        System.out.println("Test Case 2 Output: " + solver.lengthOfLongestSubstring(test2)); 

        String test3 = "pwwkew";
        System.out.println("Test Case 3 Output: " + solver.lengthOfLongestSubstring(test3)); 
    }
}
