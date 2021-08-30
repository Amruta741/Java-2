package area;

public class CalcArea extends Shape{
	
	void rectangleArea(int l,int b)
	{
		System.out.println("Area of Reactangle : " +(l*b));
	}
	
	void squareArea(int s) 
	{
		System.out.println("Area of Square : " +(s*s));
	}
	
	void circleArea(int r)
	{
		System.out.println("Area of circle : " +(3.14*r*r));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CalcArea ca=new CalcArea();
			ca.rectangleArea(4, 7);
			ca.circleArea(5);
			ca.squareArea(5);
	}

}
