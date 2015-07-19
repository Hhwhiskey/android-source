package com.bloc.objects;

class Ensemble extends Object {
	// Name
	String mName;	
	
	// All of the artists in the group
	Artist[] mArtists;	

	/*
	 * Ensemble
	 *
	 * This constructor takes in a variable length of Artist objects.
	 * This is an overloaded constructor that calls down to the complete
	 * constructor below.
	 *
	 * @param artists variable length artists (Artist... artists)(Artist[]artists)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the first Ensemble constructor
	/************************************************/
		Ensemble (Artist[] artists) {
			mArtists = artists;			
			//added code to view variables
            /*System.out.println("Artist constructor variable line....mName = " + 
                   mName +  ", mArtists = " + mArtists[0] + 
                   "mFirstName = " + artists[0].getFirstName() + ", mLastName = " +
                   artists[0].getLastName());*/
            //Had to add the following line here, because even though it says it wants 
            //this in the second constructor, Main.java tests it here...grrrrr
            
            if (mName == null) {
                mName = artists[0].getFirstName() + " " + artists[0].getLastName();
                /*System.out.println("mName null Artist variable line....mName = " + 
                    mName);*/
            }
		}
	/*
	 * Ensemble
	 *
	 * This constructor takes a name and a variable length of Artist objects
	 * Side-effect: if the 'name' parameter is null, uses the first and
	 * 				last name of the first Artist
	 * Hint:		You can add Strings together with a '+'
	 *
	 * @param name the name of the group (String)
	 * @param artists variable length artists (Artist... artists)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Create the second Ensemble constructor
	/************************************************/
	public Ensemble (String name, Artist[] artists) {
		
		mArtists = artists;
		
		if(name == null) {
			mName = mArtists[0].mFirstName + " " + mArtists[0].mLastName;			
			
		} else {
			mName = name;
		}
	}	
}