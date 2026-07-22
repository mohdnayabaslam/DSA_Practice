class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int i,len=candyType.length,count=1,currenttype=candyType[0];
        for(i=0;i<len-1;i++)
        {
            if(candyType[i]!=candyType[i+1])
            {
                count++;
            }
        }
        return Math.min(count,len/2);
    }
}