package Basic;

public class Studentmarks {

	public static void main(String[] args) {
		int sub1= 78;
		int sub2 = 45;
		int sub3= 62;
		int total_marks=(sub1+sub2+sub3);
		int max_marks=100*3;
		double percentage = (total_marks/(double)max_marks)*100;
		System.out.println("total_marks of Robert:"+total_marks);
		System.out.println("percentage_marks:"+percentage + "%" );
		
		}

}
