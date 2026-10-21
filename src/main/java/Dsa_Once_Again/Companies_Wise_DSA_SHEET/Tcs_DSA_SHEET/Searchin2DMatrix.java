class Searchin2DMatrix {
	static boolean tocheck(int[][] matrix, int target)
	{
		int rows= matrix.length;
		int cols= matrix[0].length;
		
		
		int start=0;
		int end= rows*cols-1;
		
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			//convert the mid to the row and cols to access the value 
			int row=mid/cols; //cols-> means the number of cols in the mexxtirix dude 4
			int col=mid%cols;
			
		//case:1 
			if(matrix[row][col]==target)
			{
				return true;
			}
		//case:2
			else if(matrix[row][col]<target)
			{
				start = mid+1;
			}
		//case:3	
			else {
				end= mid-1;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
	 int[][] matrix = {
    {1, 3, 5, 7},
    {10, 11, 16, 20},
    {23, 30, 34, 60}
}; 
     boolean result= tocheck(matrix,3);
	 System.out.println(result);
	}
}