import java.util.Scanner;
class Bitwise{

	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);
		int n;
		
		
		n=in.nextInt();

		System.out.println("Multiply by 2:"+(n<<1));
		System.out.println("Divide by 2:"+(n>>1));

	}
}