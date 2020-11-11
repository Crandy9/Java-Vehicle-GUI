/*
 * File: Hybrid.java
 * Author: Linden Crandall
 * Purpose: Create a gui and display report of details
 * for various cars i.e. sales tax, weight, make and model and type
 */

import java.text.DecimalFormat;

public class Hybrid extends Automobile {
	DecimalFormat df = new DecimalFormat( "$###,###.00" );
	private String makeModel;
	private int purchasePrice;
	private double salesTax;
	private int mpg;
	
	
	// constructor initializing fields
	public Hybrid(String makeModel, int purchasePrice, int mpg) {
		super(makeModel, purchasePrice);
		this.makeModel = makeModel;
		this.purchasePrice = purchasePrice;
		this.mpg = mpg;
		salesTax(purchasePrice);
	}

	// overridden method that returns sales tax. salesTax = salestax - discount
	// discount = 100 dollars if mpg < 40. Else discount = 2 dollars per mpg > 40
	// mpg
	public double salesTax(int salesPrice) {
		double baseSalesTax = salesPrice * .05;
		int discount = 0;
		if (mpg <= 40) {
			discount = 100;
		} else if (mpg > 40) {
			discount = (2 * (mpg - 40)) + 100;
		}
		salesTax = baseSalesTax - discount;
		return salesTax;
	}

	// overridden toString returns make and model, sales price, sales tax and mpg
	public String toString() {
		return "\nMake and model: " + makeModel + "\nSales price: " + df.format(purchasePrice) + "\nSales Tax: " + df.format(salesTax)
				+ "\nHybrid Vehicle\nMiles Per Gallon: " + mpg + "\n";
	}
}
