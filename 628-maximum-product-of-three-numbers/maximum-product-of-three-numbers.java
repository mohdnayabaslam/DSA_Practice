class Solution {
    public int maximumProduct(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int n1=nums[len-1]*nums[len-2]*nums[len-3];
        int n2=nums[0]*nums[1]*nums[len-1];
        return (Math.max(n1,n2));
    }
}