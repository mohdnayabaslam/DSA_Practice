class Solution {
    public int getLeastFrequentDigit(int n) {
        int i,minindex=0;
        int freq[] = new int [10];
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            freq[r]++;
        }
        for(i=0;i<10;i++)
        {
            if(freq[i]!=0)
            {
                minindex=i;
                break;
            }
        }
        for(i=0;i<10;i++)
        {
            if(freq[i]<freq[minindex] && freq[i]!=0)
            {
                minindex=i;
            }
        }
        return minindex;
    }
}