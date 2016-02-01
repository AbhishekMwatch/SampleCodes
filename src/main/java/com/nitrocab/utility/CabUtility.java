/**
 * 
 */
package com.nitrocab.utility;

import java.util.Date;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

import com.nitrocab.model.BookingRequest;
import com.nitrocab.model.CabDetails;

/**
 * The {@code CabUtility} this is the helper class required to process any
 * request for cab booking.
 * 
 * @author kumarabhishek
 *
 */
public final class CabUtility {

	private CabUtility() {

	}

	/**
	 * This the method which will filter cab based on the time and profit margin
	 * and gives the best cab
	 * 
	 * @param cabsList
	 * @param bookingRequest
	 * @return CabDetails
	 */
	public static CabDetails filterCabs(List<CabDetails> cabsList,
			BookingRequest bookingRequest) {

		System.out.println("Inside the filter cabs based on time");
		NavigableMap<Double, CabDetails> cabProfiltMap = new TreeMap<Double, CabDetails>();
		for (CabDetails cabDetails : cabsList) {

			// Total time it will take to reach
			long totalKmsToTravel = Math
					.abs((cabDetails.getInitialLocation() - bookingRequest
							.getDropAreaCode()));
			long totalTimeMins = totalKmsToTravel * 2;

			if (totalTimeMins > (bookingRequest.getPickUpTime().getTime() - new Date()
					.getTime() / (1000 * 60)) + 15) {

				double profiltMargine = calculateProfitMargin(totalKmsToTravel,
						bookingRequest);
				if (profiltMargine > 20) {

					cabProfiltMap.put(profiltMargine, cabDetails);

				}
			}

		}

		return cabProfiltMap.lastEntry().getValue();

	}

	/**
	 * Calculate the profit margin.
	 * 
	 * @param totalKmsToTravel
	 * @param bookingRequest
	 * @return double
	 */
	private static double calculateProfitMargin(long totalKmsToTravel,
			BookingRequest bookingRequest) {

		System.out.println("Inside the filter cab based on the profit margine");
		long distanceToDrop = Math.abs(bookingRequest.getPickUpAreaCode()
				- bookingRequest.getDropAreaCode());
		double totalCostIncured = (totalKmsToTravel + distanceToDrop) * 5;
		return (distanceToDrop * 10 - totalCostIncured) * 100 / distanceToDrop
				* 10;

	}
	
	public static List<CabDetails> loadAllTheCabsAvailableforBooking(){
		return null;
		
	}

}
