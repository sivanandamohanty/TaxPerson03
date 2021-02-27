package TaxPerson;

/*
 * This class is created for Unit testing the code while development
 */
public class MainClass {

	public static void main(String[] args) {

		TaxItems taxItem = new TaxItems();
		
		double dItemNecessary = taxItem.calculateCostAfterTax(3.00, ItemType.NECESSARY);		
		System.out.println("Cost of " + ItemType.LUXURY + " is : " + dItemNecessary);
		
		double dItem1 = taxItem.calculateCostAfterTax(4, ItemType.NECESSARY);		
		System.out.println("Cost of " + ItemType.NECESSARY + " is : " + dItem1);
		
		double dItemLuxary = taxItem.calculateCostAfterTax(3.00, ItemType.LUXURY);		
		System.out.println("Cost of " + ItemType.LUXURY + " is : " + dItemLuxary);		
		
		double dItemZeroValue = taxItem.calculateCostAfterTax(0.00, ItemType.NECESSARY);		
		System.out.println("API returned : " + dItemZeroValue);
		
		double dItemNegativeValue = taxItem.calculateCostAfterTax(-3.00, ItemType.LUXURY);		
		System.out.println("API returned : " + dItemNegativeValue);	
		
		double dItemMoreThanTwoDecimalValue = taxItem.calculateCostAfterTax(5.002, ItemType.LUXURY);		
		System.out.println("API returned : " + dItemMoreThanTwoDecimalValue);

		//test line
		

		
	}

}
