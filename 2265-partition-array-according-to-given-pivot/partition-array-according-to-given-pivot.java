class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i,len=nums.length,k=0;
        int arr[] = new int[len];
        for(i=0;i<len;i++)
        {
            if(nums[i]<pivot)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        for(i=0;i<len;i++)
        {
            if(nums[i]==pivot)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        for(i=0;i<len;i++)
        {
            if(nums[i]>pivot)
            {
                arr[k]=nums[i];
                k++;
            }
        }
        return arr;
    }
}