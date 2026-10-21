class BesttimeBuyandSell {
	static void besttimebuyandsell(int[] prices)
	{
		int buyprices= prices[0];
		int profit=0;
		int maxprofit=0;
		for(int i=1; i<prices.length; i++)
		{
			if(buyprices<prices[i])
			{
				profit= prices[i]-buyprices;
				maxprofit= Math.max(profit,maxprofit);
			}
			else {
				buyprices= prices[i];
			}
		}
		System.out.println(maxprofit + " ");
	}
	public static void main(String[] args)
	{
		//int[] prices = {7, 10, 1, 3, 6, 9, 2};
		int[] prices= {7, 6, 4, 3, 1};
 		besttimebuyandsell(prices);
	}
}