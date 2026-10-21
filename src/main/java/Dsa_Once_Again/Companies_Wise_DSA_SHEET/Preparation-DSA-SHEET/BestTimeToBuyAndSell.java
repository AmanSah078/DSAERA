class BestTimeToBuyAndSell {
	static int bestsell(int[] prices)
	{
		int maxprofit=0;
		//1st day we can buy only na dude
		int buyprices= prices[0];
		int profit=0;
		int maxprofit= 0;
		//now start from 1 
		for(int i=1; i<prices.length; i++)
		{
			if(prices[i]>buyprices)
			{
			 profit= prices[i]-buyprices;
		    maxprofit=Math.max(profit,maxprofit);
			}
			else {
				buyprices= prices[i];
			}
		} 
		return maxprofit;
	}
	public static void main(String[] args)
	{
		int[] prices= {7,1,5,3,6,4};
		int result= bestsell(prices);
		System.out.println(result);
	}
}