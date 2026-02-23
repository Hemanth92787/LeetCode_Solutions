class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> st = new HashSet<>();
        int n = arr.length;
        for(int i =0; i < n -1; i++){
            Set<Integer> st2 = new HashSet<>();
            for(int j = i+1; j < n; j++){
                int thrid = -(arr[i] + arr[j]);
                if(st2.contains(thrid)){
                    List<Integer> lt = new ArrayList<>();
                    lt.add(arr[i]);
                    lt.add(arr[j]);
                    lt.add(thrid);
                    Collections.sort(lt);
                    st.add(lt);
                }
                st2.add(arr[j]);

            }
        }
        return new ArrayList<>(st);
    }
}