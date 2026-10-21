import java.util.HashMap;
class Freq_Array {
	static void findthefreqArray(int[] arr)
	{
	HashMap<Integer,Integer> map= new HashMap<>();
	for(int i=0; i<arr.length; i++)
	{
		if(map.containsKey(arr[i]))
		{
			//if yes then?
			int count= map.get(arr[i]);
			count++;
			map.put(arr[i],count);
		} 
		  //if not dude then?
		else {
			map.put(arr[i],1);
		}
	}
		//now it's time to find the unique array element
	for(int i=0; i<arr.length; i++)
	{
		if(map.get(arr[i])==1)
		{
			System.out.println(arr[i]+  " ");
			break;
		}
	}
	}
	public static void main(String[] args)
	{
		int[] arr= {2,3,2,4,3,5,5};
		findthefreqArray(arr);
	}
	
}