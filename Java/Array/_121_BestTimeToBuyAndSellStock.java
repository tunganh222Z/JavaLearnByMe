package Array;

import java.util.Scanner;

public class _121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++){
            prices[i] = sc.nextInt();
        }

        _121_BestTimeToBuyAndSellStock test = new _121_BestTimeToBuyAndSellStock();

        System.out.println(test.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int dayBuy = 0;
        int daySell = 1;
        int maximumProfit = 0;

        while (daySell < prices.length && dayBuy < daySell){
            if (prices[daySell] < prices[dayBuy]){
                dayBuy = daySell;
                daySell++;
            } else {
                maximumProfit = Math.max(maximumProfit,prices[daySell] - prices[dayBuy]);
                daySell++;
            }
        }
        return maximumProfit;
    }
}
