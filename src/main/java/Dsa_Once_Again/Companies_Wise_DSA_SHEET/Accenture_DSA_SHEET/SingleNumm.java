import java.util.HashSet;
class SingleNumm {
	static void tofindtheunique(int[] arr)
		
	{
		HashSet<Integer> set= new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(set.contains(arr[i]))
			{
				set.remove(arr[i]);
			}
			set.add(arr[i]);
		}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int[]arr= {2,2,3,4,3};
		tofindtheunique(arr);
	}
}