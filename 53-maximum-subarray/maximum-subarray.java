class Solution {
    public int maxSubArray(int[] nums) {
        int i,len=nums.length;
        int cursum=0,maxsum=nums[0];
        for(i=0;i<len;i++)
        {
            cursum=cursum+nums[i];
            if(cursum>maxsum)
                maxsum=cursum;
            if(cursum<0)
                cursum=0;
        }
        return maxsum;
    }
}