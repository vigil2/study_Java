
public class accountingAppArrayLoop {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {

		vatRate = 0.1;
		valueOfSupply = Double.parseDouble(args[0]);
		 
		double vat = getVAT(valueOfSupply, vatRate);
		double total = gettotal(vat);
		double expense = getexpense(expenseRate);
		double income = valueOfSupply - expense;

		
		
		print(vat, total, expense, income);

		double [] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length){
			System.out.println("Dividend  :" + (income * dividendRates[i]) );
		}
	}

	public static void print(double vat, double total, double expense, double income) {
		System.out.println("Value of supply :" + valueOfSupply);
		System.out.println("VAT :" + vat);
		System.out.println("Total :" + total);
		System.out.println("Expense :" + expense);
		System.out.println("Income :" + income);
	}

	public static double getexpense(double expenseRate) {
		return valueOfSupply * expenseRate;
	}

	public static double gettotal(double vat) {
		return valueOfSupply + vat;
	}

	private static double getVAT(double valueOfSupply, double vatRate) {
		return valueOfSupply * vatRate;
	}

}
