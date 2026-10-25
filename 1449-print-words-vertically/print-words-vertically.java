class Solution {
    public List<String> printVertically(String s) 
    {
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String w : words)
        {
            maxLength = Math.max(maxLength, w.length());
        }
        List<String> ans = new ArrayList<>();
        for (int j = 0; j < maxLength; j++) 
        {
            StringBuilder sb = new StringBuilder();
            for (String w : words)
            {
                sb.append(j < w.length() ? w.charAt(j) : ' ');
            }
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
            {
                sb.deleteCharAt(sb.length() - 1);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}   