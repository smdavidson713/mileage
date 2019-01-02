/**
Sydney Davidson
9/17/2018
Lab 2

	This program calculates mileage

*/

import java.util.Scanner; // scanner class
public class mileage{
	public static void main(String[] args){
		// Variables 
		double miles; // miles driven
		double gallons; // gallons of gas used
		double mileage; // mileage 

		// asks user for miles driven and gallons of gas used
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("This program will calculate mileage"); // indicates what the program does
		System.out.println("How many miles were driven?"); // displays the question asking for miles driven
		miles = keyboard.nextDouble(); // reads the miles
		System.out.println("How many gallons of gas were used?"); // displays the question asking for gallons of gas used
		gallons = keyboard.nextDouble(); // reads the gallons of gas used
		if(gallons < 1){
			System.out.println("gallons used cannot be less than 1"); // notifies the user that gallons of gas used cannot be less than 1
		}

		// calculation 
		else{
			mileage = miles / gallons; // calculates mileage


			System.out.println("The mileage calculated is " + mileage + " miles per gallon"); // tells user the mileage 
		}
		

	}
}