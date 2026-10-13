class Solution {
    public long maxAlternatingSum(int[] nums) {
        int i,len=nums.length;
        long pos=0,neg=0;
        for(i=0;i<len;i++)
        {
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(i=0;i<len/2;i++)
        {
            neg=neg+(long)(nums[i]*nums[i]);
        }
        for(i=len/2;i<len;i++)
        {
            pos=pos+(long)(nums[i]*nums[i]);
        }
        return pos-neg;
    }
}