class RectangleArea{

	public static void main(String args[]){

		int length,breadth;
		length=Integer.parseInt(args[0]);
		breadth=Integer.parseInt(args[1]);
		int area = length *breadth;
		System.out.println("Length="+length);
		System.out.println("Breadth="+breadth);
		System.out.println("Area="+area);
		System.out.println("Perimeter="+2*(length+breadth));
	}

}