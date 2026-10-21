import java.util.HashMap;
class Intersection_of_Two_Arrays {
	static void togetintersection(int[] arr1, int[] arr2)
	{
		//use hashmap
		HashMap<Integer,Integer> map= new HashMap<>();
		
		//Take one loop for the 1st array
		for(int i=0; i<arr1.length; i++)
		{
			map.put(arr1[i],i);
		}
		//Take the 2nd loop for the verification dude
		for(int j=0; j<arr2.length; j++)
		{
			if(map.containsKey(arr2[j]))
				
			{
				System.out.print(arr2[j] + " ");
				
			}
			map.remove(arr2[j]);
		}
	
	
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,4};
		int[] arr2= {3,4,5,6};
		togetintersection(arr1, arr2);
	}
}