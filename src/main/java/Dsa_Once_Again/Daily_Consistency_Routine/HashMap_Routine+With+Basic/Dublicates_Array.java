import java.util.HashMap;
class Dublicates_Array {
	static boolean containsdublicates(int[] arr)
	{
		//Create Hashmap
//		Hashmap<Integer,Integer> map= new Hashmap<>();
		   HashMap<Integer, Integer> map = new HashMap<>();
		
		//take one loop
		for(int i=0; i<arr.length; i++)
		{
			//Kya arr[i] value available hain as a key in the map
			if(map.containsKey(arr[i]))
			{
				return true;
			}
			else {
				
				//So here arr[i]-> is our Key
				//i->value
				map.put(arr[i],i);
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		//int[] arr={1,2,3,1};
		int[] arr={5};
		boolean result=containsdublicates(arr);
		System.out.println(result);
	}
}