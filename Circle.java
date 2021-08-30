import java.util.Scanner;

class Circle extends Shape {
	
	int r;
	
	void setRadius(int r1)
	{
		this.r=r1;
	}
	
	
	int getRadius()
	{
		return r*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radis :");
		int r=sc.nextInt();
		System.out.println("Area of Circle : "+r*r);*/
	}

}
