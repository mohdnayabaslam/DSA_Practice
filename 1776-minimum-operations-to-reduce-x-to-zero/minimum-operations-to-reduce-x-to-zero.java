class Solution {
    public int minOperations(int[] nums, int x) {
        int target = 0;
        for (int num : nums) 
        {
            target += num;
        }
        target -= x;
        if (target < 0) 
            return -1;
        if (target == 0) 
            return nums.length;
        int currentSum = 0;
        int maxWindow = -1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) 
        {
            currentSum += nums[right];
            while (left <= right && currentSum > target) 
            {
                currentSum -= nums[left];
                left++;
            }
            if (currentSum == target) 
                maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow == -1 ? -1 : nums.length - maxWindow;
    }
}   