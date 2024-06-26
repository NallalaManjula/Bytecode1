package Control_statements;

public class ProfitLoss {

	public static void main(String[] args) {
		int costprice=6900;
		int sellingprice=8200;
		int profit=sellingprice-costprice;
		int loss=costprice-sellingprice;
		if(costprice<sellingprice) {
			System.out.println("its  profit and profit amount is:"+profit);
		}
		else {
			System.out. println("its loss and loss amount is:"+loss);
		}
		

	}

}
