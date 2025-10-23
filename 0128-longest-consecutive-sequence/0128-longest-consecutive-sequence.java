class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n== 0) {
            return 0;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int count = 1, longest = 1 ,x=0;
        for(int it : hs) {
            if(!hs.contains(it - 1)) {
                count =1;
                x = it;
            while(hs.contains(x + 1)) {
                count++;
                x = x + 1;
            }
            }
            longest = Math.max(longest, count);
        }
        return longest;
        
    }
}