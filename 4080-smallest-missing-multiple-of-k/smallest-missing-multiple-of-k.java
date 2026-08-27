class Solution {
    public int missingMultiple(int[] nums, int k) {
        int c=k;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:nums)
        {
            al.add(i);
        }
        int i=2;
        while(true)
        {
            if(al.contains(c))
            {
                c=k*i;
                i++;
            }
            else
            {
                break;
            }
        }
        return c;
    }
}