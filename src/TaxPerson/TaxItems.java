package TaxPerson;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

/*
 * Class for the tax calculation
 */
public class TaxItems {
	
	private double _dCost;

	/*
	 * Gets input cost
	 */
	public double getCost() {
		return _dCost;
	}

	/*
	 * Sets the input cost
	 */
	public void setCost(double _dCost) {
		this._dCost = _dCost;
	}
	

	/*
	 * Calculates the After Tax Cost of an item
	 * @param dInputCost Initial Cost of the Item
	 * @param itemType Type of the item (Luxury or Necessary)
	 * @return the double value for total after tax value in 2 decimal
	 */
	public double calculateCostAfterTax (double dInputCost, ItemType itemtype) {
		Pattern pattern = Pattern.compile("^\\s*(?=.*[1-9])\\d*(?:\\.\\d{1,2})?\\s*$");
		
		double dFinalCost = 0.00;
		if (pattern.matcher(String.valueOf(dInputCost)).find()) {
			switch (itemtype) {
			case LUXURY:
				dFinalCost = dInputCost * ItemType.LUXURY.getTaxRate();
				break;
			case NECESSARY:
				dFinalCost = dInputCost * ItemType.NECESSARY.getTaxRate();
				break;
			}
			
			return new BigDecimal(dFinalCost).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
		}
		else {
			//Code should be added to log a debug statement in case of actual implementation
			System.out.println("Cost entered is INVALID. "
					+ "Please enter a POSITIVE value with upto TWO decimal places ONLY!");
			return -2;
		}
		
	}
	

	

}
