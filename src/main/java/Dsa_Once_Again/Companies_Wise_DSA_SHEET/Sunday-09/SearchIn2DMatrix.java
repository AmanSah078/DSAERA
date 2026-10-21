class SearchIn2DMatrix {
	static boolean searchin2dmatrix(int[][] matrix, int target)
	{
		int rows= matrix.length;
	//	int cols= matrix.length[0];
		int cols= matrix[0].length;
		
		//Now to find the requiremnet for the mid
		int start=0;
		int end= rows*cols-1;
		
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			
		//Now To access the values of the matrix
		
			int row= mid/cols;
			int col= mid%cols;
			
			//Let's apply the cases
			//case:1 ?
			if(matrix[row][col]>target)
			{
				end= mid-1;
			}
			else if(matrix[row][col]<target)
			{
			start= mid+1;
			}
			else {
				return true;
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
		boolean result= searchin2dmatrix(matrix,3);
		System.out.println(result);
	}
}