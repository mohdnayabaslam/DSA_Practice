class Solution {
    public int numberOfBeams(String[] bank) {
        int i,j,len=bank.length,prevcount=0,currentcount=0,beams=0;
        String wd="";
        for(i=0;i<len;i++)
        {
            wd=bank[i];
            for(j=0;j<wd.length();j++)
            {
                if(wd.charAt(j)=='1')
                    currentcount++;
            }
            if(currentcount>0)
            {
                beams=beams+(prevcount*currentcount);
                prevcount=currentcount;
            }
            currentcount=0;
        }
        return beams;
    }
}