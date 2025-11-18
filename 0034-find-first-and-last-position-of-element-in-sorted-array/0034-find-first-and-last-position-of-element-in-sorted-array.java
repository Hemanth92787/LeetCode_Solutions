class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int pos = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                pos = mid;
                r = mid - 1; 
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return pos;
    }

    private int findLast(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int pos = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                pos = mid;
                l = mid + 1; 
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return pos;
    }
}
