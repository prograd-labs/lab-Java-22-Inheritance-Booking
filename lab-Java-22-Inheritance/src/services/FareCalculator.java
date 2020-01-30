package services;

//Import the class Bus, Flight, Hotel and Train from model package

//Import the ChronoUnit package (java --> time --> temporal --> ChronoUnit)

//Create a class named FareCalculator which inherits the class Booking

	//Create a method named book with a parameter hotel of type Hotel
	//This method is to calculate the tariff of the hotel booking 
		
		//Create a variable tariff of the type double

		//Create a variable noOfPerson of type Integer
		//Call the appropriate getter method

		//Create a variable rates of type Integer
		//Call the appropriate getter method

		//Create a variable days of type long
		//Calculate the no of days using between() method. Know more about between(). Get your hands on search bar, let the browser do the required magic.

		//Create a variable named rate
		//This variable would hold the booking amount for the no of person
		//Call the method booking from the base class and the return value

		//Create a variable named month of type integer
		//Call the getFromdate and getMonthValue. getMonthValue would return Integer. getMonth would return String. We would need integer value
		
		//Print the values to check the approximations

		
		//if month value is greater than or equal to 1 and less than 4 or greater than 6 and less than 11, calculate the tariff amount
		//tariff should be reduced by 25%. Do the math
		//if not it implies it is a peak season. Raise the tariff amount by 50%

		//return the tariff  amount

		
	//Overload the method book with the parameter changed to bus of type Bus

		//Create a variable rate of type double
		//call the method booking from the super class with the noOfPersons and getRates (Use the getter method to retrive the values)

		//return rate
	
	//Repeat the previous procedure for flight and train
