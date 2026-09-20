class Solution {
    public int reverseDegree(String s) {
        int i,len=s.length(),sum=0;
        for(i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            int x = (ch-97)*2;
            int k=(ch-71-x);
            sum=sum+(k*(i+1));
        }
        return sum;
    }
}