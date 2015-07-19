package com.bloc.objects;

class Artist extends Object {
	// The artist's first name
	String mFirstName;
	// The artist's last name
	String mLastName;
	

	/*
	 * Artist
	 *
	 * @param firstName (String)
	 * @param lastName (String)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the Artist constructor
	/************************************************/
	
	/*Artist artist1 = new Artist ("tom", "petty");
	Artist artist2 = new Artist ("tom", "jones");
	Artist artist3 = new Artist ("brian", "wilson");
	Artist artist4 = new Artist ("george", "strait");
	
	//mArtists = {artist1, artist2, artist3, artist4}
	 *
*/	
	public Artist (String firstName, String lastName) {
		this.mFirstName = firstName;
		this.mLastName = lastName;
	}
		
	public void setFirstName(String sFirstName) {
		mFirstName = sFirstName;
	}
	
	public String getFirstName() {
		return mFirstName;
	}
	
	public void setLastName(String sLastName) {
		mLastName = sLastName;
	}
	
	public String getLastName() {
		return mLastName;
	}
	
	
}