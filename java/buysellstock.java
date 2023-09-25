package java;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int leastSoFar = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            leastSoFar = Math.min(prices[i], leastSoFar);
            if(prices[i] > leastSoFar){
                profit = Math.max(profit, prices[i] - leastSoFar);
            }
        }
        return profit;
    }
}
