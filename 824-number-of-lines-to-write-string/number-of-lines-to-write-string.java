class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int i,sum=0,len=s.length(),lines=0;
        for(i=0;i<len;i++)
        {
            int n=s.charAt(i)-97;
            if(sum+widths[n]<=100)
            {
                sum=sum+widths[n];           
            }
            else
            {
                
                lines++;
                sum=0;
                i--;
            }
        }

        return new int[]{lines+1,sum};
    }
}