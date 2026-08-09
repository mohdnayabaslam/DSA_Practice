class Solution {
    public int minimumLength(String s) {
        int i,len=s.length(),left=0,right=len-1;
        char ch;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {
                ch=s.charAt(left);
                while(left<=right && ch==s.charAt(left))
                {
                    left++;
                }
                while(left<=right && ch==s.charAt(right))
                {
                    right--;
                }
            }
            else
                break;
        }
        if(left<=right)
            return right-left+1;
        return 0;
    }
}