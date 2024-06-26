package Control_statement;
import java.util.Scanner;

public class Weekdays_check {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a week number (1-7):");
	        int weekNumber = scanner.nextInt();
	        if (weekNumber == 1) {
	            System.out.println("Sunday");
	        } else if (weekNumber == 2) {
	            System.out.println("Monday");
	        } else if (weekNumber == 3) {
	            System.out.println("Tuesday");
	        } else if (weekNumber == 4) {
	            System.out.println("Wednesday");
	        } else if (weekNumber == 5) {
	            System.out.println("Thursday");
	        } else if (weekNumber == 6) {
	            System.out.println("Friday");
	        } else if (weekNumber == 7) {
	            System.out.println("Saturday");
	        } else {
	            System.out.println("Invalid week number. Please enter a number between 1 and 7.");
	        }

	        
	        scanner.close();
	    }
	}
