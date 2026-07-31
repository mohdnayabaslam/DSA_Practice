class Solution {
    public int[] replaceElements(int[] arr) {
        int i,j,len=arr.length,max=0;
        for(i=0;i<len-1;i++)
        {
            max=-1;
            for(j=i+1;j<len;j++)
            {
                if(arr[j]>max)
                    max=arr[j];
            }
            arr[i]=max;
        }
        arr[len-1]=-1;
        return arr;
    }
}