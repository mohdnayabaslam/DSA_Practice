class Solution {
    public int[] separateDigits(int[] nums) {
        int i;
        List<Integer> result = new ArrayList<>();
        for (int num : nums) 
        {
            List<Integer> digits = new ArrayList<>();
            while(num > 0) 
            {
                digits.add(num % 10);
                num = num/10;
            }
            Collections.reverse(digits);
            result.addAll(digits);
        }
        int[] ans = new int[result.size()];
        for (i = 0; i < ans.length; i++) 
        {
            ans[i] = result.get(i);
        }
        return ans;
    }
}   