class Solution {
    public int search(int[] nums, int target) {
        int i,len=nums.length;
        int low=0,high=len-1,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && nums[mid]>target)
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(nums[high]>=target && nums[mid]<target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}