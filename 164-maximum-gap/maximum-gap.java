class Solution {
    public int maximumGap(int[] nums) {
        if((nums.length)<2)
            return 0;
        Arrays.sort(nums);
        int i,max=0,len=nums.length;
        for(i=0;i<len-1;i++)
        {
            int currdiff=nums[i+1]-nums[i];
            max=Math.max(max,currdiff);
        }
        return max;
    }
}