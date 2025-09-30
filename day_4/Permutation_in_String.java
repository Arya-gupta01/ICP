package day_4;

public class Permutation_in_String {
    public static void main(String[] args) {
        String str = "eidbaooo";
        String pattern = "ab";
        System.out.println(check(pattern, str));
    }

    public static boolean check(String s1, String s2) {
        int[] count = new int[26];
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            count[s2.charAt(right) - 'a']--;
            while (count[s2.charAt(right) - 'a'] < 0) {
                count[s2.charAt(left) - 'a']++;
                left++;
            }
            if (right - left + 1 == s1.length()) {
                return true;
            }
        }
        return false;
    }

}
