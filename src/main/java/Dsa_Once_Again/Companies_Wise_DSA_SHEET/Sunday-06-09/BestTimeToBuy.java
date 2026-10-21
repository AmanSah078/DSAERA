class BestTimeToBuy {
	static int maxprofit(int[] prices)
	{
		int profit=0;
		int maxprofit=0;
		//Hey dude first day u will be buy hi na bhai
		int buyprices=prices[0];
		
		for(int i=1; i<prices.length; i++)
		{
			if(prices[i]>buyprices)
			{
//				profit= prices[i]-buyprices;
//				int maxprofit=Math.max(maxprofit,profit);
profit = prices[i] - buyprices;
maxprofit = Math.max(maxprofit, profit);
			}
else {
	buyprices=prices[i];
}
}
return maxprofit;
		
	}
	public static void main(String[] args)
	{
		//int[] prices= {7,1,5,3,6,4};
		int[] prices= {7,6,4,3,1};
		int result= maxprofit(prices);
		System.out.println(result);
	}
}