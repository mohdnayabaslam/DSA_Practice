class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3)
            return nums[nums.length-1];
        int i,len=nums.length,count=1;
        for(i=len-2;i>=0;i--)
        {
            if(nums[i]!=nums[i+1])
                count++;
            if(count==3)
                return nums[i];
        }
        return nums[len-1];
    }
}