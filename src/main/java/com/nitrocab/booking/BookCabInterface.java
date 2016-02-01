/**
 * 
 */
package com.nitrocab.booking;

import com.nitrocab.exception.BookingException;
import com.nitrocab.model.BookingRequest;
import com.nitrocab.model.CabDetails;

/**
 * {@code BookCabInterface} is the interface which can be called for booking a
 * cab.
 * 
 * @author kumarabhishek
 *
 */
public interface BookCabInterface {

	/**
	 * 
	 * @param bookingRequest
	 * @return String
	 * @throws CabDetails
	 */
	public CabDetails bookACab(BookingRequest bookingRequest)
			throws BookingException;

}
