class BestTimeToBuy {
	static int tomaxprofit(int[] prices)
	{
		//First i will buy na dude
		int buyprices= prices[0];
		int profit=0;
		int maxprofit=0;
		
		for(int i=1; i<prices.length; i++)
		{
			if(buyprices>prices[i])
			{
				buyprices= prices[i];
			}
			else {
				profit= prices[i]-buyprices;
			}
			if(maxprofit<profit)
			{
				maxprofit= profit;
			}
		}
		return maxprofit;
	}
	public static void main(String[] args)
	{
		//int[] prices= {7,1,5,3,6,4};
		int[] prices= {7,6,4,3,1};
		int result= tomaxprofit(prices);
		System.out.println(result);
	}
	
}