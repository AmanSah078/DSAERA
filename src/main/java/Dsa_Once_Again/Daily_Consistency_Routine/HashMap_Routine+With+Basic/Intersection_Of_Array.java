

//The Second_Way By using the HashSet
import java.util.HashSet;
class Intersection_Of_Array
{
	static void findtheintersection(int[] nums1, int[] nums2)
	{
	//To create the HashSet
	HashSet<Integer> set= new HashSet<>();
	
	//To store the 1st array inside the hashset
	for(int i=0; i<nums1.length; i++)
	{
	set.add(nums1[i]);
	}
	
	//Now Take the 2nd loop for the Verfication
	for(int i=0; i<nums2.length; i++)
	{
		//kya ye nums2 ka value set mein available hain
		if(set.contains(nums2[i]))
		{
			System.out.println(nums2[i] + " ");
			set.remove(nums2[i]);
		}
	}
	}
	public static void main(String[] args)
	{
		int[] nums1={4,9,5};
		int[] nums2={9,4,9,8,4};
		findtheintersection(nums1,nums2);
	}
}