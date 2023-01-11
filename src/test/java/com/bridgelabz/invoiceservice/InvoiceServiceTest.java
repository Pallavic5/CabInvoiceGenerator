package com.bridgelabz.invoiceservice;
/*
 * Step 1: Calculate Fare
 * Given distance and time, the invoice generator should return the total fare for the journey
 * cost - Rs. 10 per Kilometer + Rs. 1 per minute.
 * Minimum Fare - Rs. 5
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InvoiceServiceTest {
	/*
	 * Test Cases
	 */
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(25, fare, 0.0);
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		assertEquals(5, fare, 0.0);
	}

}
