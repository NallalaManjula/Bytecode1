package Basic;

public class Operators2 {

	public static void main(String[] args) {
	int number = 2345,a = 8;
	int addition= number+a;
	int quotient= addition /3;
	int  remainder =  quotient % 5;
	int finalresult = remainder*5;
	
	
	System.out.println("after addition:" + addition);
	System.out.println("after division:" +quotient);
	System.out.println("after modulus divsion:"+remainder);
	System.out.println(" finalresult:"+finalresult);
	}

}
