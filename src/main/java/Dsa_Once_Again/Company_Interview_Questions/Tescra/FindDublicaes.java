import java.util.HashSet;
class FindDublicaes {
static void tofinddublicates(int[] arr)
{
	HashSet<Integer> set= new HashSet<>();
	
	for(int i=0; i<arr.length; i++)
		
	{
		if(set.contains(arr[i]))
		{
			System.out.println(arr[i]);
		}
		else {
			set.add(arr[i]);
		}
	}
	
}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,2,4,5,1,6};
		tofinddublicates(arr);
	}
}