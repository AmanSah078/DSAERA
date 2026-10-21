import java.util.HashMap;
class TwoSum {
	static void tosum(int[] arr, int target)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			int req= target-arr[i];
			
			if(map.containsKey(req))
			{
				//If yes then?
				System.out.println(map.get(req)+" " + i);
			}
			else {
				map.put(arr[i],i);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {3, 2, 4};
		tosum(arr,6);
	}
}