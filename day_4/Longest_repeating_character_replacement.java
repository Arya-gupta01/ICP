package day_4;

public class Longest_repeating_character_replacement {
    
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1;
        int ans=characterReplacement(s,k);
        System.out.println(ans);
    }
    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int maxLength = 0;

        while (right < s.length()) {
            count[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}
