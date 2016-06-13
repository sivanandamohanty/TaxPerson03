package UnitTest;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

import TaxPerson.ItemType;
import TaxPerson.TaxItems;

public class TaxItemTest {

	@Test
	public void testCalculateTaxLuxaryPositive() {
		TaxPerson.TaxItems items = new TaxPerson.TaxItems();
		
		items.setCost(5.00);
		double dTaxRateForLuxaryItem = 1.09;
		double expectedTotalCost = new BigDecimal(items.getCost() * dTaxRateForLuxaryItem).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
		
		assertTrue(expectedTotalCost == items.calculateCostAfterTax(items.getCost(), TaxPerson.ItemType.LUXURY));
	}
	
	@Test
	public void testCalculateTaxNecessaryPositive() {
		TaxPerson.TaxItems items = new TaxPerson.TaxItems();
		
		items.setCost(5.00);
		double dTaxRateForNecessaryItem = 1.01;
		double expectedTotalCost = new BigDecimal(items.getCost() * dTaxRateForNecessaryItem).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
		
		assertTrue(expectedTotalCost == items.calculateCostAfterTax(items.getCost(), ItemType.NECESSARY));
	}
	
	
	@Test
	public void testCalculateTaxMoreThanTwoDecimalCostNegativeTest() {
		TaxPerson.TaxItems items = new TaxItems();
		
		items.setCost(5.0004);		
		double expectedTotalCost = -2.0;
		assertTrue(expectedTotalCost == items.calculateCostAfterTax(items.getCost(), ItemType.NECESSARY));
	}
	
	@Test
	public void testCalculateTaxNegativeCostNegativeTest() {
		TaxItems items = new TaxItems();
		
		items.setCost(-5.00);		
		double expectedTotalCost = -2.0;
		assertTrue(expectedTotalCost == items.calculateCostAfterTax(items.getCost(), ItemType.NECESSARY));
	}

}
