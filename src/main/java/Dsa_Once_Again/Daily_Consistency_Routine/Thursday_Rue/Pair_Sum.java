import java.util.HashMap;
class Pair_Sum {
	static boolean findthepairfromthetwosortedArray(int[] arr, int target)
	{
		//I am going to use the HashMap
		HashMap<Integer,Integer> map= new HashMap<>();
		int req=0;
		for(int i=0; i<arr.length; i++)
		{
			req=target-arr[i];
			if(map.containsKey(req))
			{
				return true;
			}
			else {
				map.put(arr[i],i);
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		//int[] arr={1,2,3,4,5};
		int[] arr={2,7,11,15};
		boolean result= findthepairfromthetwosortedArray(arr,9);
		System.out.println(result);
	}
}