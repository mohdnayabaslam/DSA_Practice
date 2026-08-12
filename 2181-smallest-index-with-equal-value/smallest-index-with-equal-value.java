class Solution {
    public int smallestEqual(int[] nums) {
        int i,len=nums.length;
        for(i=0;i<len;i++)
        {
            if(i%10==nums[i])
                return i;
        }
        return -1;
    }
}