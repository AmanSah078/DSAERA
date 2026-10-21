//import java.util.Hashmap*;
import java.util.HashMap;
class Tow_Sum {
	static void findthetwosum(int[] arr, int target)
	{
//		Hashmap<Integer,Integer> map = new Hashmap<>();
		        HashMap<Integer, Integer> map = new HashMap<>();
		int req=0;
		for(int i=0; i<arr.length; i++)
		{
//			int req=target-arr[i];
			//now chceck 
			req=target-arr[i];
			if(map.containsKey(req))
			{
				System.out.println(map.get(req) + " " +i);
//				System.out.println(req + " " +i);
//				map.get(arr[i] + " " i);
			}
			//no then 
			else {
				map.put(arr[i],i);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr={3,2,4};
		findthetwosum(arr,6);
		
			
	}
}