package day_4;

public class Longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLength = 0;
        int[] count = new int[128];

        while (right < s.length()) {
            count[s.charAt(right)]++;
            while (count[s.charAt(right)] > 1) {
                count[s.charAt(left)]--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
    
}
