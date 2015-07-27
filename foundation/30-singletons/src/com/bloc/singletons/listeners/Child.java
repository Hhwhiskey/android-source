package com.bloc.singletons;

/************************************************
 *	YOU MAY NOT MODIFY THIS FILE
/************************************************/

import com.bloc.singletons.Listener;

public class Child extends Object implements Listener {

	@Override
	public void onMessageReceived(String message) {
		// Ignore
		System.out.println("I can't hear yooouuuu");
	}
	
}