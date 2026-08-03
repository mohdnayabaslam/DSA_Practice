class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int i,len=nums.length,maxprime=0;
        for(i=0;i<len;i++)
        {
            if(isPrime(nums[i][i]))
                maxprime=Math.max(maxprime,nums[i][i]);
            if(isPrime(nums[i][len-1-i]))
                maxprime=Math.max(maxprime,nums[i][len-1-i]);
        }
        return maxprime;
    }
    static boolean isPrime(int n)
    {
        int count=0;
        int a=(int)Math.sqrt(n);
        if(n<=1)
            return false;
        for(int i=1;i<=a;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
            return true;
        return false;
    }
}