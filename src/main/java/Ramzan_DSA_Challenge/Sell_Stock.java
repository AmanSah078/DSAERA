package Ramzan_DSA_Challenge;

public class Sell_Stock {
    static void findstock(int[] prices)
    {
        int buyprices=Integer.MAX_VALUE;
        int maxprofit=0;
        int max=0;

        for(int i=0;i<prices.length;i++) {

            if (buyprices < prices[i])
            {
                maxprofit = prices[i] - buyprices;
            max = Math.max(max, maxprofit);
        }
        else{
                buyprices = prices[i];
            }
        }
        System.out.println("Maximum Profit: "+max);
    }
    public static void main(String[] args) {
        {
            int[] prices={7,1,5,3,6,4};
            findstock(prices);

        }
    }
}
