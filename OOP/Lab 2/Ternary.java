import java.util.Scanner;
class Ternary{

	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);

		System.out.println("Enter a");
		int a=in.nextInt();
		System.out.println("Enter b");
		int b=in.nextInt();
		System.out.println("Enter c");
		int c=in.nextInt();
		
		int max,min;
		
		max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		min=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		

	}
}