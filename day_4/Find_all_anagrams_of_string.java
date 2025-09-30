package day_4;

public class Find_all_anagrams_of_string {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String  p = "abc";
        findAnagrams(s, p);

    }

    public static void findAnagrams(String s, String p) {
        int[] parr = new int[26];
        int[] sarr = new int[26];
        for (char c : p.toCharArray()) {
            parr[c - 'a']++;
        }
        for (int i = 0; i < p.length(); i++) {
            sarr[s.charAt(i) - 'a']++;
        }
        if (matches(parr, sarr)) {
            System.out.println(0+",");
        }
        for (int i = p.length(); i < s.length(); i++) {
            sarr[s.charAt(i) - 'a']++;
            sarr[s.charAt(i - p.length()) - 'a']--;
            if (matches(parr, sarr  )) {
                System.out.println((i - p.length() + 1) + ",");
            }
        }
    }

    public static boolean matches(int[] parr, int[] sarr) {
        for (int i = 0; i < 26; i++) {
            if (parr[i] != sarr[i]) {
                return false;
            }
        }
        return true;
    }

}


