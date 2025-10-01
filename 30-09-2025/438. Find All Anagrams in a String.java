import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            // add current char to window
            sCount[s.charAt(i) - 'a']++;

           
            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }

          
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
}
