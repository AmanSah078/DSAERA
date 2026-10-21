class MajorityElement {
	static int majorityelementt(int[] arr)
	{
		int majority=arr[0];
		int voting=0;
		
		//case:1
		for(int i=0; i<arr.length; i++)
		{
		if(voting==0)
		{
;			majority=arr[i];
			voting++;
		}
        //case:2
		else if(majority==arr[i])
		{
         majority=arr[i];
         voting++;
		}
		else {
			voting--;
		}
		}
		return majority;
		
	}
public static void main(String[] args)
{
	//int[] arr= {3,2,3};
	int[] arr= {2,2,1,1,1,2,2};
	int result= majorityelementt(arr);
	System.out.println(result);
}
}