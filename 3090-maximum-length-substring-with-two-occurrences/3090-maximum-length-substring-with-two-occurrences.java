class Solution {
    public int maximumLengthSubstring(String s) {
        int [] count = new int[26];
        int left = 0, maxlength = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            int index = ch - 'a';

            count[index]++;
            while(count[index] > 2) {
                char leftch = s.charAt(left);
                count[leftch - 'a']--;
                left++;
            }
            int windowsize = right - left +1;
            if(windowsize > maxlength) {
                maxlength = windowsize;
            }

        }
        return maxlength;
    }
}