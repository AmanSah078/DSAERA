import java.util.HashMap;
class Freq_Count {
	static void findthefreq(int[] arr)
	{
		   HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				//if yes then?
			    int count= map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else {
			//if not then
			map.put(arr[i],1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
	
	int[] arr={10, 5, 10, 15, 10, 5};
	findthefreq(arr);
	}
}