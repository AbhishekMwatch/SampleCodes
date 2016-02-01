/**
 * 
 */
package com.nitrocab.booking;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.nitrocab.exception.BookingException;
import com.nitrocab.model.BookingRequest;
import com.nitrocab.model.CabDetails;
import com.nitrocab.utility.CabUtility;

/**
 * This {@code BookNitroCab} is the implementation of the booking interface
 * 
 * @author kumarabhishek
 *
 */
public class BookNitroCab implements BookCabInterface {

	public CabDetails bookACab(BookingRequest bookingRequest)
			throws BookingException {

		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.setTime(bookingRequest.getPickUpTime());
		cal2.setTime(new Date());
		//Cheking if the date selected is on the same day
		boolean sameDay = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR)
				&& cal1.get(Calendar.DAY_OF_YEAR) == cal2
						.get(Calendar.DAY_OF_YEAR);

		if (!sameDay
				|| bookingRequest.getPickUpTime().getTime()
						- new Date().getTime() / (1000 * 60) > 15) {
			return null;
		}
		List<CabDetails> cabsList = CabUtility
				.loadAllTheCabsAvailableforBooking();

		if (!cabsList.isEmpty()) {
			CabDetails cabDetails = CabUtility.filterCabs(cabsList,
					bookingRequest);
			// Remove the cabs form the availableList
			cabsList.remove(cabDetails);
			return cabDetails;

		}
		return null;
	}
}
