class NumberOfSteps {
	
	//create fucntion
	//what u want
	static int  findthenumberofsteps(int nums, int steps)
	{
		//when i should stop and return 
		if(nums==0)
		{
			return steps;
		}
		//Extra
		if(nums%2==0)
		{
			//what u want to do with me
			return findthenumberofsteps(nums/2,steps+1);
		}
		//what u want to do with me
		return findthenumberofsteps(nums-1,steps+1);
	}
	//main
	public static void main(String[] args)
	{
		int nums=14;
		int result=findthenumberofsteps(nums,0);
		System.out.println(result);
		
	}
}