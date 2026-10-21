import java.util.HashMap;
class RemoveDublicatesFromSortedArray {
	static int removedublicates(int[] arr)
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
		//now to print only the unique element
		for(int i=0; i<arr.length; i++)
		{
			if(map.get(arr[i])==1)
			{
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,1,2};
		int result= removedublicates(arr);
		System.out.println(result);
	}
} 