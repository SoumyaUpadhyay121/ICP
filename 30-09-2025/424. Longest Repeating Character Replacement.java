class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, max = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            // update frequency of current char
            count[s.charAt(right) - 'A']++;
            // track the highest frequency in window
            max = Math.max(max, count[s.charAt(right) - 'A']);

            // check if window is valid
            while ((right - left + 1) - max > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // update ans
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

