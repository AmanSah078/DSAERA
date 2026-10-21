import java.util.HashMap;
class ContainsDublicate{
	static boolean tocontainDublicate(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
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
		//int[] arr ={1,2,3,1};
		//int[] arr= {1,2,3,4};
		int[] arr= {1,1,1,3,3,4,3,2,4,2};
		boolean result= tocontainDublicate(arr);
		System.out.println(result);
	}
}