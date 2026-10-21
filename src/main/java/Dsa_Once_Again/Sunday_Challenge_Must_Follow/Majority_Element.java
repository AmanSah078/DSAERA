//We r solve this problem by using the Voting Method
class Majority_Element {
	static void findthemajorityelement(int[] arr)
	{
		//intially we have to take the 2 var
		int candidate=0;
		int vote=0;
		
//Take one loop
		for(int i=0; i<arr.length; i++)
			
		{
//Rule:1
			if(vote==0)
			{
			candidate=arr[i];
			vote=1;	
			}
//Rule:2
			else if(candidate==arr[i])
			{
				vote++;
			}
//Rule:3 jb humara 	candidate is not equal to current element		
			else {
				vote--;
			}
		}
		System.out.println("Majority Element will be " + candidate);
	}
	public static void main(String[] args)
	{
		int[] arr={3,2,3};
		findthemajorityelement(arr);
		
	}
}