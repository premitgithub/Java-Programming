package Array;
import java.util.*;
public class BuyingAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buying = Integer.MAX_VALUE;
        int selling = Integer.MAX_VALUE;
        int[] profit = new int[prices.length];
        int max_profit = Integer.MIN_VALUE;

        for(int i=0 ; i<prices.length ; i++){
            selling = prices[i];
            profit[i] = selling - buying;
            buying = Math.min(buying,prices[i]);
            max_profit = Math.max(profit[i], max_profit);
            
        }
        System.out.println(Arrays.toString(profit));
        System.out.println(max_profit);

    }
    
}
