class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charCount = new int[256];
        int left = 0, right = 0, maxLength = 0;
        while(right <= s.length()-1) {
            int rightAscii = s.charAt(right);
            if(charCount[rightAscii] == 0) {
                charCount[rightAscii]++;
                maxLength = Math.max(maxLength, right-left+1);
                right++;
            } else {
                int leftAscii = s.charAt(left);
                left++;
                charCount[leftAscii]--;
            }
        }
        return maxLength;
    }
}