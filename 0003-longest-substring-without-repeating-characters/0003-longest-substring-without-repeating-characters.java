class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[256]; 
        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1; 
        }

        int maxLength = 0; 
        int start = 0; 

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (lastSeen[currentChar] >= start) {
                start = lastSeen[currentChar] + 1; 
            }
            lastSeen[currentChar] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
