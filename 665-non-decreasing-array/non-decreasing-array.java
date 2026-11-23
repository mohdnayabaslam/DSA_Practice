class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean changed = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (changed) 
                    return false;
                if (i > 0 && nums[i - 1] > nums[i + 1])
                    nums[i + 1] = nums[i];
                else
                    nums[i] = nums[i + 1];
                changed = true;
            }
        }
        return true;
    }
}   