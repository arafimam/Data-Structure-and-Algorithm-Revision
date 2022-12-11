package arrays;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        return optimizedSolution(prices);
    }

    private static int optimizedSolution(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0;i<prices.length;i++){
            if (prices[i]<minPrice){
                minPrice = prices[i];
            }
            else if(prices[i]-minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    private static int firstSolution(int[] prices){
        int max = 0;
        for (int i = 0; i<prices.length; i++){
            for (int j=i+1;j<prices.length;j++){
                if (prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

}
