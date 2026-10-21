import java.util.HashMap;
class FreqCount {
	static void freqofelement(int[] arr)
	{
		//int count=1;
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++)
		{
			//check arr[i] element is avaialble as a key in the map or not
			if(map.containsKey(arr[i]))
{
    //if yes then
    int count = map.get(arr[i]);
    count++;
    map.put(arr[i], count);
}
			else {
				map.put(arr[i],1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 2, 1, 1, 2, 5, 2};
		freqofelement(arr);
	}
}