import java.util.Arrays;
class MeetingRooms {
	static boolean isMeeting(int[][] arr)
	{
		for(int i=1; i<arr.length; i++)
		{
		if(arr[i][0]<arr[i-1][1])
		{
			return false;
		}
		}
		return true;
	}
	public static void main(String[] args)
	{
	int[][] arr = {
    {0, 30},
    {5, 10},
    {15, 20}
};
		//Step-1 Sorting
	Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		boolean result= isMeeting(arr);
		System.out.println(result);
	}
}