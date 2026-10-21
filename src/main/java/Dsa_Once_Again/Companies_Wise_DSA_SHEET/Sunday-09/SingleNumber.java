import java.util.HashMap;
class SingleNumber {
	static int singlenum(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		
		//Let's use one loop outer loop
		for(int i=0; i<arr.length; i++)
		{
		 if(map.containsKey(arr[i]))
		 {
			 //now need to increast the count
			 int count= map.get(arr[i]);
			 count++;
			 map.put(arr[i],count);
		 }
			else {
			
				
			map.put(arr[i],1);
		}
		}
		//Now its time to use the inm
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
		//int[] arr ={2,2,1};
		//int[] arr={4,1,2,1,2};
		int[] arr ={1};
		int result= singlenum(arr);
		System.out.println(result);
	}
}