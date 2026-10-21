import java.util.HashMap;
class Contains_Dublicate {
	static boolean containsdublicates(int[] arr)
	{
  HashMap<Integer, Integer> map = new HashMap<>();
		//now its time to check
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
		int[] arr= {1,5,2,5,8};
		boolean result= containsdublicates(arr);
		System.out.println(result);
	}
}