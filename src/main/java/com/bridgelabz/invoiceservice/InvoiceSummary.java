package com.bridgelabz.invoiceservice;
/*
 * Problem Statement : Step 3 - Enhanced Invoice
 * The Invoice generator should now return the total number of rides, total fare, average fare per ride.
 */
public class InvoiceSummary {
	private final int numberOfRides;
	private final double totalFare;
	private final double averageFare;
	
	public InvoiceSummary(int numberOfRides, double totalFare) {
		this.numberOfRides = numberOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.numberOfRides;
	}	
	//Override the equals method
	@Override
	public boolean equals(Object object) {
		if(this == object)
			return true;
		if(object == null || getClass() != object.getClass())
			return false;
		InvoiceSummary invoice = (InvoiceSummary) object;
		return numberOfRides = invoice.numberOfRides &&
				Double.compare(invoice.totalFare, totalFare) == 0 &&
				Double.compare(invoice.averageFare, averageFare) == 0;
	}
}
