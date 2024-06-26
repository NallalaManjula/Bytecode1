package Control_statements;
import java.util.Scanner;
public class Trianglevalidity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("angle1:");
		int angle1=scanner.nextInt();
		System.out.println("angle2:");
		int angle2= scanner.nextInt();
		System.out.println("angle3:");
		int angle3= scanner.nextInt();
		scanner.close();
		
		if(angle1+angle2+angle3==180 && angle1>0 && angle2>0 && angle3>0) {
		  System.out.println("trainagle is valid.");
		} else {
			System.out.println("triangle is not valid.");
	
		}
		
	}

}
