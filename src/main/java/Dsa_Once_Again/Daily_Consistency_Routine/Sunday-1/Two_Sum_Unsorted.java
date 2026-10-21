import java.util.HashMap;
class Two_Sum_Unsorted {
	static boolean twosum(int[] arr, int target)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
		    int req= target-arr[i];
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
		int[] arr={2,7,9,11};
		boolean result= twosum(arr,11);
		System.out.println(result);
	}
}