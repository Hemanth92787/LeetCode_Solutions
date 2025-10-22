class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        
        for(int j=nums.length-1;j>index;j--){
            if(nums[j]>nums[index]){
                swap(nums,j,index);
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}