class Solution {
    public int sumOfSquares(int[] nums) {
        int i,len=nums.length,sum=0;
        for(i=1;i<=len;i++)
        {
            if(len%i==0)
                sum=sum+(nums[i-1]*nums[i-1]);
        }
        return sum;
    }
}