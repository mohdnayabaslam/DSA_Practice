class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,suffix = 1,len=nums.length;
        int[] ans = new int[len];
        ans[0]=1;
        for(i=1;i<len;i++) 
        {
            ans[i]=ans[i-1]*nums[i-1];
        }
        for(i=len-1;i>=0;i--) 
        {
            ans[i]=ans[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
    }
}