import java.util.Arrays;
class MeetingRoom {
	static boolean canAttend(int[][] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
			//This is the conditon of the overlap
			if(arr[i][0]<arr[i-1][1])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
//		int[][] arr = {
//    {5, 10},
//    {0, 30},
//    {15, 20}
//};
		int[][] arr = {
			{1,4},
			{10,15},
			{7,10}
		};

Arrays.sort(arr, (a, b) -> a[0] - b[0]);
boolean result=canAttend(arr);
System.out.println(result);
	}
}