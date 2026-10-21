import java.util.HashSet;
class RemoveDublicates {
	static void toremove(int[] arr)
	{
		HashSet<Integer> set= new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			if(!set.contains(arr))
			{
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,1,5,2};
		toremove(arr);
	}
}