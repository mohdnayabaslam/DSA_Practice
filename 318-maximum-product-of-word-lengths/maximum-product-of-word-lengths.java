class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int ans = 0;
        for (int i = 0; i < n; ++i) 
        {
            for (int j = i + 1; j < n; ++j) 
            {
                if (noCom(words[i], words[j])) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }

    private boolean noCom(String a, String b) {
        boolean[] seen = new boolean[26];
        for (char c : a.toCharArray())
        { 
            seen[c - 'a'] = true;
        }
        for (char c : b.toCharArray()) 
        {
            if (seen[c - 'a']) 
                return false;
        }
        return true;
    }
}   