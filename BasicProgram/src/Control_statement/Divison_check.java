package Control_statement;
import java.util.Scanner;

public class Divison_check {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int number = scanner.nextInt();
		 if (number % 5 == 0 && number % 11 == 0) {
	            System.out.println("The number is divisible by both 5 and 11.");
	        } else {
	            System.out.println("The number is not divisible by both 5 and 11.");
	        }
	}
	
}
		


