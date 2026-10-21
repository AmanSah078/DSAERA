import java.util.HashMap;
class Frequency {
	static void tofindfreq(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else {
			//if not then?
			map.put(arr[i],1);
		}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,1,2,3,4,5,2,3};
		tofindfreq(arr);
	}
}