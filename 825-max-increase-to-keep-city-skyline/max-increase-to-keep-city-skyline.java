class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int i,j,len=grid.length;
        int maxrow=0,maxcol=0,k=0,sum=0;
        int row[] = new int[len];
        int col[] = new int[len];
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                maxrow=Math.max(maxrow,grid[i][j]);
            }
            row[k]=maxrow;
            for(j=0;j<len;j++)
            {
                maxcol=Math.max(maxcol,grid[j][i]);
            }
            col[k]=maxcol;
            k++;
            maxrow=0;
            maxcol=0;
        }
        for(i=0;i<len;i++) 
        {
            for(j=0;j<len;j++) 
            {
                sum=sum+Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return sum;
    }
}