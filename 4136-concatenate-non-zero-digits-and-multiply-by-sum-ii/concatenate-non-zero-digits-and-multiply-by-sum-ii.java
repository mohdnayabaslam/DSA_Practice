class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int i,len=s.length();
        long MOD=1_000_000_007L;
        long[] prefSum = new long[len+1];
        long[] prefX = new long[len+1];
        int[] nonZeroCount = new int[len+1];
        long[] pow10 = new long[len+1];
        pow10[0]=1;
        for(i=1;i<=len;i++) 
        {
            pow10[i]=(pow10[i-1]*10)%MOD;
        }
        for(i=0;i<len;i++) 
        {
            int digit=s.charAt(i)-'0';
            int idx=i+1;
            prefSum[idx]=prefSum[idx-1]+digit;
            if (digit!=0) 
            {
                nonZeroCount[idx]=nonZeroCount[idx-1]+1;
                prefX[idx]=(prefX[idx-1]*10+digit)%MOD;
            } 
            else 
            {
                nonZeroCount[idx]=nonZeroCount[idx-1];
                prefX[idx]=prefX[idx-1];
            }
        }
        int numQueries=queries.length;
        int[] answer=new int[numQueries];
        for(i=0;i<numQueries;i++) 
        {
            int l=queries[i][0]+1;
            int r=queries[i][1]+1;
            int countNonZero=nonZeroCount[r]-nonZeroCount[l-1];
            if (countNonZero==0) 
            {
                answer[i] = 0;
                continue;
            }
            long currentX=prefX[r]-(prefX[l-1]*pow10[countNonZero])%MOD;
            currentX=(currentX%MOD+MOD)%MOD;
            long currentSum=prefSum[r]-prefSum[l-1];
            long finalAns=(currentX*currentSum)%MOD;
            answer[i]=(int)finalAns;
        }
        return answer;
    }
}