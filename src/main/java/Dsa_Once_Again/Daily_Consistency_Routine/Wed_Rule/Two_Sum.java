import java.util.HashMap;
class Two_Sum {
	static void findthetwosum(int[] arr, int target)
	{
		//create HashMap
	HashMap<Integer, Integer> map = new HashMap<>();
		int req=0;
		//Take the loop now
		for(int i=0; is<arr.length; i++)
		{
			//Let's take the req var
		 req=target-arr[i];
			//Now it's time to check tclasshe is req value is available inside the map as a key or not 
			//If yes then
			if(map.containsKey(req))
			{
		
//		System.out.println(map.get(req + " " + i));
				     System.out.println(map.get(req) + " " +i);
			}
		
		else {
			map.put(arr[i],i);
		}
	}
	}
	public static void main(String[] args)
	{
		int[] arr={2,7,11,15};
		findthetwosum(arr,9);
	}
}