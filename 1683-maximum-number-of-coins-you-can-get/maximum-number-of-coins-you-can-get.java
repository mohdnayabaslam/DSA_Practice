class Solution {
    public int maxCoins(int[] piles) {
        int i=0,j=0,len=piles.length,sum=0;
        Arrays.sort(piles);
        while(i<(len/3))
        {
            sum=sum+(piles[len-2-j]);
            j=j+2;
            i++;
        }
        return sum;
    }
}