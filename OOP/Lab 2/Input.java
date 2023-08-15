import java.util.Scanner;
class Input{

	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);
		int inte;
		double dou;
		char ch;
		
		inte=in.nextInt();
		dou=in.nextDouble();
		ch=in.next().charAt(0);
		
		System.out.println((byte)inte);
		System.out.println((int)ch);
		System.out.println((byte)dou);
		System.out.println((int)dou);
	}
}