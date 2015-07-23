package com.bloc.generictype;

import com.bloc.generictype.Thing.*;

import com.bloc.generictype.Toy;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox<Toy>();
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

		toyBox.addToy(new Toy("Book"));
		toyBox.addToy(new Toy("Spoon"));
		toyBox.addToy(new Toy("ActionFigure"));
		
		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
