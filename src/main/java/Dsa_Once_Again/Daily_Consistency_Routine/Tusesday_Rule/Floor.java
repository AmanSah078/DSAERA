//Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
//Output: 1
//Explanation: Largest number less than or equal to 5 is 2, whose index is 1

public class Floor {
	//Let's goot to creat the funcition
	static int tofindthefloor(int[] arr, int target)
	{
		 int start=0;
		int end=arr.length-1;
	
		if(target==0)
		{
			return -1;
		}
		while(start<end)
		{
		
		//case:1
		int mid=start+(end-start)/2;
			//hey
			
		if(arr[mid]>=target)
		{
			//Thik baa lekin ek baar left mein check kr lo
			end=mid-1;
		}
			else if(arr[mid]<target)
			{
				start= mid+1;
			}
		}
		return start;
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1, 2, 8, 10, 10, 12, 19};
		int result=tofindthefloor(arr,0);
		int result=tofindthefloor(arr,5);
		int result=tofindthefloor(arr,20);
		System.out.println(result);
		
	}
}