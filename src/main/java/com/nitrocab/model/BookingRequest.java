/**
 * 
 */
package com.nitrocab.model;

import java.util.Date;

/**
 * This {@code BookingRequest} for holding the booking attributes.
 * 
 * @author kumarabhishek
 *
 */
public class BookingRequest {

	private int bookingId;
	private Long pickUpAreaCode;
	private Long dropAreaCode;
	private Date pickUpTime;

	public BookingRequest() {

	}

	public BookingRequest(int bookingId, Long pickUpAreaCode,
			Long dropAreaCode, Date pickUpTime) {
		super();
		this.bookingId = bookingId;
		this.pickUpAreaCode = pickUpAreaCode;
		this.dropAreaCode = dropAreaCode;
		this.pickUpTime = pickUpTime;
	}

	/**
	 * @return the bookingId
	 */
	public int getBookingId() {
		return bookingId;
	}

	/**
	 * @param bookingId
	 *            the bookingId to set
	 */
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	/**
	 * @return the pickUpAreaCode
	 */
	public Long getPickUpAreaCode() {
		return pickUpAreaCode;
	}

	/**
	 * @param pickUpAreaCode
	 *            the pickUpAreaCode to set
	 */
	public void setPickUpAreaCode(Long pickUpAreaCode) {
		this.pickUpAreaCode = pickUpAreaCode;
	}

	/**
	 * @return the dropAreaCode
	 */
	public Long getDropAreaCode() {
		return dropAreaCode;
	}

	/**
	 * @param dropAreaCode
	 *            the dropAreaCode to set
	 */
	public void setDropAreaCode(Long dropAreaCode) {
		this.dropAreaCode = dropAreaCode;
	}

	/**
	 * @return the pickUpTime
	 */
	public Date getPickUpTime() {
		return pickUpTime;
	}

	/**
	 * @param pickUpTime
	 *            the pickUpTime to set
	 */
	public void setPickUpTime(Date pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

}
