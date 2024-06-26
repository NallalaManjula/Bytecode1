
package Operators;
import java.util.Scanner;

public class Average_0f_numbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num1,num2,num3,num4,num5,sum,average;
		System.out.println("Enter five numbers:");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		num4 = scanner.nextDouble();
		num5 = scanner.nextDouble();
		sum=num1+num2+num3+num4+num5;
		average=sum / 5;
		System.out.println("avreage of five numbers:"+average);
		scanner.close();
		
	}

}

