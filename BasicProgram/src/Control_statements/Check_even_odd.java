package Control_statements;
import java.util.Scanner;

public class Check_even_odd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("given number:");
		int number = scanner.nextInt();
		if(number%2==0){
			System.out.println("the given number is even.");
		   }else {
			   System.out.println("the given number is odd.");
		}
		
       scanner.close();
	}

}
