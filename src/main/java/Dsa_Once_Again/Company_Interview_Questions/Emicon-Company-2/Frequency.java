import java.util.HashMap;
class Frequency {
	static void tofreqelement(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			
			if(map.containsKey(arr[i]))
			{
				int count= map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else {
				map.put(arr[i],1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		int[] arr=  {1, 2, 2, 3, 1, 4, 2};
		tofreqelement(arr);
	}
}