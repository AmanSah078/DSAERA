import java.util.HashMap;
class ContainsDublicate {
	static boolean isdublicate(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<anrr.length; i++)
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
		int[] arr= {1,2,3,5};
		boolean result= isdublicate(arr);
		System.out.println(result);
	}
}