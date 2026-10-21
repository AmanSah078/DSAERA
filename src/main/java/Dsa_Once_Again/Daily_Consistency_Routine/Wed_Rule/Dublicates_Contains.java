import java.util.HashMap;
class Dublicates_Contains {
	static boolean checkdublicates(int[] arr)
	{
		HashMap<Integer,Integer> map= new HashMap<>();
		//Let's take the loop
		for(int i=0; i<arr.length; i++)
		{
			//It check is arr[i] element is valiable inside the map as  a key or not 
			//if yes then?
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
		int[] arr={1,2,3,4};
		boolean result=checkdublicates(arr);
		System.out.println(result);
	}
}