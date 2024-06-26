package Control_statements;

public class Triangle_type {

	public static void main(String[] args) {
		int side1=5;
		int side2=5;
		int side3=10;
		if(side1==side2 &&  side2==side3) {
			     System.out.println("it is a equilteral triangle.");
		   }	else if (side1==side2 || side2==side3) {
			   System.out.println("it is a isosceles triangle.");
			   }
		   else {
			   System.out.println("its a scalene traingle");
		   }
			   
		}
		
	}


