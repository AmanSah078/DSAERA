import java.util.HashMap;
import java.util.Arrays;
class TwoSum {
	static int[] twosum(int[] arr, int target)
	{
		//we r using the HashMap
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			int required= target-arr[i];
			if(map.containsKey(required))
			{
//				return map.get(required + " " + i)
				return new int[]{map.get(required), i};
			}
			else {
				map.put(arr[i],i);
			}
		}
		return new int[]{-1, -1};
	    
	}
	public static void main(String[] args)
	{
		int[] arr = {2, 7, 11, 15};
int[] result = twosum(arr, 9);
System.out.println(Arrays.toString(result));
	}
}