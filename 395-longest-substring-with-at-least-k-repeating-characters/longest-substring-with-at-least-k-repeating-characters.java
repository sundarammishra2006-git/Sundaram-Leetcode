class Solution {
    public int longestSubstring(String s, int k) {
        if (s == null || s.length() < k) {
            return 0;
        }

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] < k) {
                int maxLen = 0;

                for (String part : s.split(String.valueOf(c))) {
                    maxLen = Math.max(maxLen, longestSubstring(part, k));
                }

                return maxLen;
            }
        }

        return s.length();
    }
}