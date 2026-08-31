class Solution {
    public int[] minOperations(String boxes) {
        int i,j,len=boxes.length(),sum=0;
        int arr[] = new int[len];
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                if(i!=j && boxes.charAt(j)=='1')
                {
                    sum=sum+(Math.abs(i-j));
                }
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
}