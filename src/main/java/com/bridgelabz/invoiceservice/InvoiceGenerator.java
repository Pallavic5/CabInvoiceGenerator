package com.bridgelabz.invoiceservice;
/*
 * Step 1: Calculate Fare
 * Given distance and time, the invoice generator should return the total fare for the journey
 * cost - Rs. 10 per Kilometer + Rs. 1 per minute.
 * Minimum Fare - Rs. 5
 */
public class InvoiceGenerator {
	/*
	 * initialized variable with constant values
	 * final keyword is the keyword and access modifier which is used to apply restrictions on a class, 
	 * method or variable.
	 */
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KILOMETER = 10;
	private static final double MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if (totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}

}
