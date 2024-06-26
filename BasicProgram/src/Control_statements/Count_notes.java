package Control_statements;
import java.util.Scanner;

public class Count_notes {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the amount: ");
	        int amount = scanner.nextInt();
	        scanner.close();
	        int totalNotes = 0;
	        if (amount >= 2000) {
	            int count = amount / 2000;
	            totalNotes += count;
	            amount -= count * 2000;
	            System.out.println("2000 : " + count);
	        }
	        if (amount >= 500) {
	            int count = amount / 500;
	            totalNotes += count;
	            amount -= count * 500;
	            System.out.println("500 : " + count);
	        }
	        if (amount >= 200) {
	            int count = amount / 200;
	            totalNotes += count;
	            amount -= count * 200;
	            System.out.println("200 : " + count);
	        }

	        if (amount >= 100) {
	            int count = amount / 100;
	            totalNotes += count;
	            amount -= count * 100;
	            System.out.println("100 : " + count);
	        }
	        if (amount >= 50) {
	            int count = amount / 50;
	            totalNotes += count;
	            amount -= count * 50;
	            System.out.println("50 : " + count);
	        }
	        if (amount >= 20) {
	            int count = amount / 20;
	            totalNotes += count;
	            amount -= count * 20;
	            System.out.println("20 : " + count);
	        }
	        if (amount >= 10) {
	            int count = amount / 10;
	            totalNotes += count;
	            amount -= count * 10;
	            System.out.println("10 : " + count);
	        } 
	        if (amount >= 5) {
	            int count = amount / 5;
	            totalNotes += count;
	            amount -= count * 5;
	            System.out.println("5 : " + count);
	        }
            if (amount >= 2) {
	            int count = amount / 2;
	            totalNotes += count;
	            amount -= count * 2;
	            System.out.println("2 : " + count);
	        }
            if (amount >= 1) {
	            int count = amount / 1;
	            totalNotes += count;
	            amount -= count * 1;
	            System.out.println("1 : " + count);
	        }

	        System.out.println("Total number of notes: " + totalNotes);
	    }
	
		
	}


