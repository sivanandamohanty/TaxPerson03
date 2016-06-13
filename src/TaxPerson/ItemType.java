package TaxPerson;

/*
 * Enum for the ItemType
 * The reason for creating an eNum is if we add a new ItemType in future, 
 * then we can add it here and then update the switch-case statement 
 * in the implementing class with the new value
 */
public enum ItemType {
	NECESSARY(1.01),
	LUXURY(1.09);
	
	private final double TAXRATE;
	//Constructor 
	ItemType(double dTaxRate) {
		this.TAXRATE = dTaxRate;
	}

	public double getTaxRate() {
		return TAXRATE;
	}
}
