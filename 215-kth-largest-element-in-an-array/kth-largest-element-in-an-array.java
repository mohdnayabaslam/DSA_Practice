class Solution {
    public int findKthLargest(int[] nums, int k) {
        int i,len=nums.length;
        Arrays.sort(nums);
        return nums[len-k];
    }
}