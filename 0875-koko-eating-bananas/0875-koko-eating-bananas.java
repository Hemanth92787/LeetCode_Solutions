class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int max1 : piles){
            max = Math.max(max1, max);
        }

        int low = 1, high = max, ans = max;
        while(low <= high) {
            int mid = (low + high)/2;
            if(totalHours(piles, mid) <= h){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return ans;
    }

    public long totalHours(int[] piles, int num) {

        long th = 0;
        for(int th1 : piles){
            th += (long)Math.ceil((double)th1/num);
        }
        return th;
    }
}