class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j,row=matrix.length,col=matrix[0].length;
        int mat[][] = new int[col][row];
        for(i=0;i<col;i++)
        {
            for(j=0;j<row;j++)
            {
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}