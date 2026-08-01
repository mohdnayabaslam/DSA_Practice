class Solution {
    public int absDifference(int[] nums, int k) {
        int i,len=nums.length,lsum=0,ssum=0;
        Arrays.sort(nums);
        if(k<1)
            return 0;
        for(i=0;i<k;i++)
        {
            lsum=lsum+nums[len-i-1];
            ssum=ssum+nums[i];
        }
        return (Math.abs(lsum-ssum));
    }
}