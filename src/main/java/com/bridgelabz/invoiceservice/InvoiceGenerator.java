package com.bridgelabz.invoiceservice;
/*Problem Statement
 * Step 2: Multiple Rides
 * The invoice generator should now take in multiple rides, and calculate the aggregate total for all.
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
	static double totalFare;
		//create method for calculate total fare
	public double calculateFare(double distance, int time) {
		double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if (totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}
		//create method for calculate multiple rides
	public double calculateFare(Ride[] rides) {
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
}
