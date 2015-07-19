package com.bloc.securitypackages;

import com.bloc.securitypackages.Color;
import com.bloc.securitypackages.Fruit;
import com.bloc.securitypackages.apples.Green;
import com.bloc.securitypackages.apples.Macintosh;
import com.bloc.securitypackages.citrus.Grapefruit;
import com.bloc.securitypackages.citrus.Orange;
import com.bloc.securitypackages.colors.OrangeColor;

/************************************************
 *	ASSIGNMENT:
 *	Import the appropriate classes/packages below
/************************************************/

// e.g. import com.bloc.{your_package};

/************************************************
 *	DO NOT MODIFY BELOW THIS BLOCK
/************************************************/

public class Main extends Object {

	public static void main(String [] args) {
		Fruit[] fruits = new Fruit[4];
		fruits[0] = new Macintosh();
		fruits[1] = new Green();
		fruits[2] = new Orange();
		fruits[3] = new Grapefruit();
		
		/*System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);*/		
		
		Color[] colors = new Color[5];
		colors[0] = fruits[0].getColor();
		colors[1] = fruits[1].getColor();
		colors[2] = fruits[2].getColor();
		colors[3] = fruits[3].getColor();
		colors[4] = new OrangeColor();
		
		/*System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);
		System.out.println(colors[4]);*/
		
		


		
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
