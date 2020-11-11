/*
 * File: Automobile.java
 * Author: Linden Crandall
 * Purpose: Create a gui and display report of details
 * for various cars i.e. sales tax, weight, make and model and type
 */
import java.text.DecimalFormat;

public class Automobile {
	DecimalFormat df = new DecimalFormat( "$###,###.00" );
	private String makeModel;
	private int purchasePrice;
	private double salesTax;
	
	// constructor that allows make and purchase price to be initialized
	public Automobile(String makeModel, int purchasePrice) {
		this.makeModel = makeModel;
		this.purchasePrice = purchasePrice;
		salesTax(purchasePrice);
	}

	// method that returns base sales tax computed as 5% of the sales price
	public double salesTax(int purchasePrice) {
		salesTax = purchasePrice * .05;
		return salesTax;
	}

	// toString method that returns string of make and model, sales price, and sales
	// tax
	// appropriately labeled
	public String toString() {
		return "\nMake and Model: " + makeModel + "\nSales price: " + df.format(purchasePrice) + "\nSales Tax: " + df.format(salesTax) + "\n";
	}
}
