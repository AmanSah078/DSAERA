import java.util.HashMap;
class SingleNum {
	static int uniquenum(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count= map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else{
				map.put(arr[i],1);
			}
		}
		//now to print the element which come only once time let's gooo dost
		for(int i=0; i<arr.length; i++)
		{
		if(map.get(arr[i]) == 1)
		{
			return arr[i];
	
		}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		//int[] arr= {2,2,1};
		
		//int[] arr= {4,1,2,1,2};
		int[] arr= {1};
 		int result= uniquenum(arr);
		System.out.println(result);
	}
}