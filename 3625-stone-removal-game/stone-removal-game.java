class Solution {
    public boolean canAliceWin(int n) {
        int stonesToRemove = 10;
        int turnCount = 0;
        while (n >= stonesToRemove) 
        {
            n -= stonesToRemove;
            stonesToRemove--;
            turnCount++;
        }
        return turnCount % 2 == 1;
    }
}   