package Operators;
import java.util.Scanner;


public class Sign_of_a_given_number {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Enter a number: ");
		        double number = scanner.nextDouble();
		        String result = (number > 0) ? "positive" :
		                        (number < 0) ? "negative" : "zero";
		        System.out.println("The number is " + result + ".");

		        
		        scanner.close();
	}
}	
