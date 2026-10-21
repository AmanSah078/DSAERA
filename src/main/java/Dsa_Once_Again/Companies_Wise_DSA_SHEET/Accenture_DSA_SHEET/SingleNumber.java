import java.util.HashSet;
class SingleNumber {
	static void togetsinglenum(int[] arr)
	{
		HashSet<Integer> set= new HashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			if(set.contains(arr[i])) //->> Agar dublicates element hain to?
			{
            set.remove(arr[i]);
			}
			else {
//				System.out.println(arr[i]);
					set.add(arr[i]);
			}
	}
		System.out.println(set);
	}
	public static void main(String[] args)
	{
		int[] arr= {2,2,1};
		togetsinglenum(arr);
	}
}