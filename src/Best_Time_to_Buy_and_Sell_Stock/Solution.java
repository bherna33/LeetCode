package Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int current = prices[0];        // Assuming this is the lowest price

        for(int i = 1; i<prices.length; i++){       //loop through array
            if(current > prices[i]){        // if there is a lower price than out current
                current = prices[i];        // update here
            }
            else{
                if(prices[i] - current > profit){       // compare with profit
                    profit = Math.max(profit, (prices[i] - current));       // takes the max of the two
                }
            }
        }
        return profit;      // return profit
    }
}
