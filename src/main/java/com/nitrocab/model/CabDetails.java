/**
 * 
 */
package com.nitrocab.model;

/**
 * {@code CabDetails} is to the model class to hold the cab related details.
 * 
 * @author kumarabhishek
 *
 */
public class CabDetails {

	private String cabNumber;
	private Long initialLocation;

	public CabDetails() {
	}

	public CabDetails(String cabNumber, Long initialLocation) {
		super();
		this.cabNumber = cabNumber;
		this.initialLocation = initialLocation;
	}

	/**
	 * @return the cabNumber
	 */
	public String getCabNumber() {
		return cabNumber;
	}

	/**
	 * @param cabNumber
	 *            the cabNumber to set
	 */
	public void setCabNumber(String cabNumber) {
		this.cabNumber = cabNumber;
	}

	/**
	 * @return the initialLocation
	 */
	public Long getInitialLocation() {
		return initialLocation;
	}

	/**
	 * @param initialLocation
	 *            the initialLocation to set
	 */
	public void setInitialLocation(Long initialLocation) {
		this.initialLocation = initialLocation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cabNumber == null) ? 0 : cabNumber.hashCode());
		result = prime * result
				+ ((initialLocation == null) ? 0 : initialLocation.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CabDetails other = (CabDetails) obj;
		if (cabNumber == null) {
			if (other.cabNumber != null)
				return false;
		} else if (!cabNumber.equals(other.cabNumber))
			return false;
		if (initialLocation == null) {
			if (other.initialLocation != null)
				return false;
		} else if (!initialLocation.equals(other.initialLocation))
			return false;
		return true;
	}

}
