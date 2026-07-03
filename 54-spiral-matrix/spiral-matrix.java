class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i,row=matrix.length,col=matrix[0].length;
        int top=0,bottom=row-1,left=0,right=col-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left<=right && top<=bottom)
        {
            for(i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            for(i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}