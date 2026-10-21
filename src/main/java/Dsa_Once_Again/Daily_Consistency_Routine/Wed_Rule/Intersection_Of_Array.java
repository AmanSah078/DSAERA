import java.util.*;
class Intersection_Of_Array {
	static void findtheintersection(int[] arr1, int[] arr2)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		//first we should keep the 1st outer loop inside the map
		for(int i=0; i<arr1.length; i++)
			
		{
			map.put(arr1[i],i);
		}
		//Let's see the inner loop
		for(int i=0; i<arr2.length; i++)
		{
		if(map.containsKey(arr2[i]))
		{
	
			System.out.print(arr2[i]+ " ");
			map.remove(arr2[i]);
		}
	}
}
	public static void main(String[] args)
	{
		int[] arr1 ={1, 2, 1, 3, 1};
		int[] arr2= {3, 1, 3, 4, 1};
		findtheintersection(arr1,arr2);
	}
}