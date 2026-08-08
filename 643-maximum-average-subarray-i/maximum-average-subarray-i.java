class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i,len=nums.length,sum=0,maxsum=0;
        for(i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        maxsum=sum;
        for(i=k;i<len;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}