/*
 * File: Electric.java
 * Author: Linden Crandall
 * Purpose: Create a gui and display report of details
 * for various cars i.e. sales tax, weight, make and model and type
 */

import java.text.DecimalFormat;

public class Electric extends Automobile {
	DecimalFormat df = new DecimalFormat( "$###,###.00" );
	private String makeModel;
	private int purchasePrice;
	private double salesTax;
	private int weight;
	
	
	
	// initialize make, model, price and weight
	public Electric (String makeModel, int purchasePrice, int weight) {
		super(makeModel, purchasePrice);
		this.makeModel = makeModel;
		this.purchasePrice = purchasePrice;
		this.weight = weight;
		salesTax(purchasePrice);
	}

	// overridden method sales tax that returns total sales tax.
	// sales tax = 5% of purchase price - discount
	// discount is 150 dollars, if weight is less than 3000 pounds, discount is 200
	public double salesTax(int salesPrice) {

		salesPrice = purchasePrice; 
		if (weight <= 3000) {
			salesTax = (purchasePrice * .05) - 200;
		} else {
			salesTax = (purchasePrice * .05) - 150;
		}
		return salesTax;
	}

	// overridden toString returns make and model, sales price, sales tax and weight
	public String toString() {
		return "\nMake and Model: " + makeModel + "\nSales price: " + df.format(purchasePrice) + "\nSales Tax: " + df.format(salesTax)
				+ "\nElectric Vehicle\nWeight: " + weight + " lbs.\n";
	}

}
