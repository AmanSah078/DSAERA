class LCM {
	static void findthelcm(int n1, int n2)
	{
		int org1=n1;
		int org2= n2;
		//first find the GCD
		while(n2!=0)
		{
			int temp=n2;
			n2=n1%n2;
			n1=temp;
			
		}
		int gcd=n1;
		
		System.out.println("GCD is" + gcd);
		//now to solve the LCM
		int lcm=(org1*org2)/gcd;
		System.out.println("LCM" + lcm);
	}
	public static void main(String[] args)
	{
//		int n1=12;
//		int n2=18;
		
	
		findthelcm(15,20);
	}	
}