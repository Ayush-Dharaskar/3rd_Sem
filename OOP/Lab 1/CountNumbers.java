class CountNumbers{

	public static void main(String args[]){
		int number,pcount=0,ncount=0,ocount=0;
		for(int i=0;i<10;i++)
		{
			number = Integer.parseInt(args[i]);
			if(number>0)
			{
				pcount++;
			}
			else if(number<0)
			{
				ncount++;
			}
			
			else
			{
				ocount++;
			}	
		}
		
		System.out.println("Positive:"+pcount);
		System.out.println("Negative:"+ncount);
		System.out.println("0 count:"+ocount);


	}

}