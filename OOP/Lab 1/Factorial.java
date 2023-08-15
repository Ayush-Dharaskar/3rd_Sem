class Factorial{

	public static void main(String args[]){
		int n,fact=1;

		
		n=Integer.parseInt(args[0]);
		while(n>0)
		{		
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial:"+fact);
		




	}

}