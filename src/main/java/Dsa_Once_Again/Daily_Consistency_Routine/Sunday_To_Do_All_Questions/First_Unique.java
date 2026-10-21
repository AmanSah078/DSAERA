import java.util.HashMap;
class First_Unique 
{
	static void findtheuique(int[] arr)
	{
		   HashMap<Integer, Integer> map = new HashMap<>();
		//now first i have to find the freq of evevy eleemnt
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				int count=map.get(arr[i]);
				count++;
				map.put(arr[i],count);
			}
			else {
				map.put(arr[i],1);
			}
			
		}
		//need to take one more loop dude
		for(int i=0; i<arr.length; i++)
			
		{
			if(map.get(arr[i])==1)
			{
				System.out.println(arr[i] + " ");
				//break;
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {2,3,2,4,3,5,5};
          findtheuique(arr);          

}
}