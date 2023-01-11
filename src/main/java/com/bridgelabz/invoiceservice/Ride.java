package com.bridgelabz.invoiceservice;
/*Problem Statement
 * Step 2: Multiple Rides
 * The invoice generator should now take in multiple rides, and calculate the aggregate total for all.
 */
public class Ride {
	public double distance;
	public final int time;

	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}
}
