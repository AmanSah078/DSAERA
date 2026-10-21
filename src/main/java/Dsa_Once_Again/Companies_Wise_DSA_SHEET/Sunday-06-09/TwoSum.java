import java.util.HashMap;
class TwoSum {
	static void towsumm(int[] arr, int target)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			int reqsum= target-arr[i];
			
			//Check is reqsum is used as a key in the map or not 
			//if yes then 
		if(map.containsKey(reqsum))
			{
				System.out.println(map.get(reqsum)+ " " + i);
			}
			else {
				map.put(arr[i],i);
			}
		}
	
		
	}
	public static void main(String[] args)
	{
		int[] arr=  {2,7,11,15};
		towsumm(arr,9);
	}
}