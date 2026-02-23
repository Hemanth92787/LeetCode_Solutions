class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        int mini = n/2 +1;
        for(int c : nums) {
            map.put(c, map.getOrDefault(c ,0) +1);
           
            
        }

        for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
            if(mp.getValue() > n / 2) {
                return mp.getKey();
            }
        }
        return -1;  
    }
}