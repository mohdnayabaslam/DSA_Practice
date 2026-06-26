class Solution {
    public String convert(String s, int numRows) {
        int i,j,len=s.length(),currentrow=0;
        if(len<=numRows || numRows==1)
            return s;
        StringBuffer row[] = new StringBuffer[numRows];
        for(i=0;i<numRows;i++)
        {
            row[i] = new StringBuffer();
        }
        i=0;
        while(i<len)
        {
            for(j=0;j<numRows && i<len;j++)
            {
                row[j].append(s.charAt(i));
                i++;
            }
            for(j=numRows-2;j>0 && i<len;j--)
            {
                row[j].append(s.charAt(i));
                i++;
            }
        }
        StringBuffer ans = new StringBuffer();
        for(i=0;i<numRows;i++)
        {
            ans.append(row[i]);
        }
        return ans.toString();
    }
}