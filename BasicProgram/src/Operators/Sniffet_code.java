package Operators;

public class Sniffet_code {

	public static void main(String[] args) {
		int x = 10;   
	       int y = 20;   
	       int z = x++ + ++y;   
	     //here x is post incremented so the value will be same =>x=10
	     //y is pre incremented so the value will be increased first by 1 =>20+1=21
	       System.out.println(z); 

	}

}
