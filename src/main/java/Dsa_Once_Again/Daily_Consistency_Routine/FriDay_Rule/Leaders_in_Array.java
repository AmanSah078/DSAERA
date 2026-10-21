
import java.util.ArrayList;
class Leaders_in_Array {
	static void findtheleadersrighttoleft(int[] arr)
	{
	 ArrayList<Integer> leaders = new ArrayList<>();
	int rightleader= arr[arr.length-1];
	leaders.add(rightleader);
		
		//Now
		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i]>rightleader)
			{
				rightleader=arr[i];
				leaders.add(rightleader);
			}
		}
		   // Print in reverse
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
	}
	public static void main(String[] args)
	{
		int[] arr={16,17,4,3,5,2};
		findtheleadersrighttoleft(arr);
	}
	
}
