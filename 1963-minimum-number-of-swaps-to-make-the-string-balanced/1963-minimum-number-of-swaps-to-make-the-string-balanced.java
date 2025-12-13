class Solution {
    public int minSwaps(String s) {
        
        int unmatched = 0;
        int openCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[') {
                openCount++;
            } else { 
                if (openCount > 0) {
                    openCount--;
                } else {
                    unmatched++;
                }
            }
        }

        
        return (unmatched + 1) / 2;
    }
}