class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int mini = n/3 +1;
        for(int c : nums) {
            map.put(c, map.getOrDefault(c ,0) +1);
            if(map.get(c) == mini) {
                list.add(c);
            }
            if(list.size() == 2) break;
        }
        return list;
    }
}