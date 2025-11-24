class Solution {
    public String longestPalindrome(String s) {
        String  maxLength = "";
        for(int i = 0; i <= s.length()-1; i++){
            for(int j = i+1; j <= s.length(); j++){
                String str = s.substring(i, j);
                boolean status = palin(str);
                if(status) {
                    if(str.length() > maxLength.length()){
                        maxLength = str;
                    }
                }
            }
        }
        return maxLength;
        
    }
    public boolean palin(String str) {
        int i = 0, j = str.length()-1;
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}