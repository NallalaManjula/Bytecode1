package Control_statements;

public class Maximum_of_threenumbers {

	public static void main(String[] args) {
		int a=20,b=15,c=10;
		int max=(a>b)?(a>c?a:b):(b>c?b:c);
		System.out.println("max between three numbers:"+max);
	}

}
