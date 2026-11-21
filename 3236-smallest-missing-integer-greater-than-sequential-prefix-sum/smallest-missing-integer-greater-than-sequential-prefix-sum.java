class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) 
                sum = sum + nums[i];
            else
                break;
        }
        boolean[] isPresent = new boolean[51];
        for (int num : nums) 
        {
            isPresent[num] = true;
        }
        for (int candidate = sum; ; candidate++) 
        {
            if (candidate >= isPresent.length || !isPresent[candidate]) {
                return candidate;
            }
        }
    }
}   