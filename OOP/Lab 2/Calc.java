import java.util.Scanner;
class Calc{

	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);
		char con;
		
		do{
			System.out.println("Enter a");
			int a=in.nextInt();
			System.out.println("Enter b");
			int b=in.nextInt();
			System.out.println("Enter operator");
			char op=in.next().charAt(0);

			switch(op){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			default:
				System.out.println("Invalid Operator");
}
			
			System.out.println("Continue (y/n)?");
			con=in.next().charAt(0);
			
			

			

		}
		while(con=='y');


		
	}
}