class Palindrome{

	public static void main(String args[]){
		int n,num;
		int r=0;
		
		num=Integer.parseInt(args[0]);
		n=num;
		while(num>0)
		{
			int dig = num%10;
			r=dig+r*10;
			num=num/10;
		}
		if(r==n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}



	}

}