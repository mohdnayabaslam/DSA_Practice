class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int i,j,len=queries.length,count=0;
        int l=points.length;
        int arr[] = new int[len];
        for(i=0;i<len;i++)
        {
            for(j=0;j<l;j++)
            {
                int rsq=(queries[i][2])*(queries[i][2]);
                int calculated=(int)((Math.pow((queries[i][0]-points[j][0]),2)+(Math.pow((queries[i][1]-points[j][1]),2))));
                if(calculated<=rsq)
                {
                    count++;
                }
            }
            arr[i]=count;
            count=0;
        }
        return arr;
    }
}