import java.util.HashMap;
class Freq_Count_With_Array {
	static void findthecount(int[] arr)
	{
		//create HashMap dude
		HashMap<Integer,Integer> map= new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			//Is arr[i] value is availabe inside the map or not as a key
			if(map.containsKey(arr[i]))
			{
			//yes
				int count= map.get(arr[i]);
				count++;
				//also need to put dude
				map.put(arr[i],count);
			}cl
			else {
				map.put(arr[i],1);
			}
		}
		//It's time to print the map?->Beacuase i want to see the output in the form key,value 
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		int[] arr={10, 20, 10, 5, 20};
		findthecount(arr);
	}
}