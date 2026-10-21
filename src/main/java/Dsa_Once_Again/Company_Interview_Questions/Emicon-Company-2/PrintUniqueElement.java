import java.util.HashSet;
class PrintUniqueElement {
	static void toprintunique(int[] arr)
	{
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			//kya arr[i] pr jo element hain that is present inside the set or not if not then simply add in the set
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
			}
			
		}
		System.out.println(set);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 2, 3, 1, 4};
		toprintunique(arr);
	}
}