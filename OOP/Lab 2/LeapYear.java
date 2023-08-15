import java.util.Scanner;
class LeapYear{

	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);
		int year;		

		year=in.nextInt();
		if(year%4!=0)
		{
			System.out.println("Common year");

		}
	
		
			else if(year%100!=0)
			{
				System.out.println("Leap year");
			}
		

			else if(year%400!=0)
			{
				System.out.println("Common year");
			}
			else 
			{
				System.out.println("Leap year");
			}
		




	}

}