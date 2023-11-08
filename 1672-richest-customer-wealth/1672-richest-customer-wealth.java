class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int wealthiest = 0;
        for(int[] i : accounts){
            int total = 0;
            for(int j : i){
                total = total + j;
            }
            wealthiest = Math.max(wealthiest, total);
        }
        
        return wealthiest;
    }
}