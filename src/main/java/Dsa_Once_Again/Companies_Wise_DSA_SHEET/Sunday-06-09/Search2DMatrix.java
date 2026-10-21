class Search2DMatrix {
	static boolean searchin2Dmatrix(int[][] matrix, int target)
	{
		//First we have to find the number of row and col
		int row= matrix.length;
		int col= matrix[0].length;
		
		int start=0; 
		int end=row*col-1;
		
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			//now to convert the row and the col in the format where they can access the row and col 
			int rows=mid/col;
			int cols= mid%col;
			//case:1
			if(matrix[rows][cols]==target)
			{
				return true;
			}
			else if(matrix[rows][cols]>target)
			{
				end=mid-1;
			}
			else {
				start= mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
	int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		boolean result= searchin2Dmatrix(matrix,3);
		System.out.println(result);
	}
}