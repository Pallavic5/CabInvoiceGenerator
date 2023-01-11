package com.bridgelabz.invoiceservice;
/*
 * Problem Statement : Step 3 - Enhanced Invoice
 * The Invoice generator should now return the total number of rides, total fare, average fare per ride.
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
		return Math.max(totalFare, MINIMUM_FARE);	
	}
		//create method for calculate multiple rides
	public InvoiceSummary calculateFare(Ride[] rides) {
		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
}
