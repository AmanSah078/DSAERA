import java.util.HashSet;
class RemoveDublicate {
	static void toremoveelement(int[] arr)
		
	{
		HashSet<Integer> set= new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			//dude if inskide the set element is coming which is not repeated then u need 
			if(!set.contains(arr))
			{
				set.add(arr[i]);
			}
		}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 2, 3, 1, 4};
		toremoveelement(arr);
		
	}
}