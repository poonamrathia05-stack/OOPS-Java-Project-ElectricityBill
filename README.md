Electricity Bill Calculation System

## Project Overview

This is a simple Java console application that calculates the monthly electricity bill of a consumer based on the number of electricity units consumed. The program uses a slab-based tariff system and demonstrates Object-Oriented Programming (OOP) concepts such as classes, objects, encapsulation, and object interaction.

## Objective

* To calculate electricity bills using different tariff slabs.
* To apply Java OOP concepts in a real-world application.
* To separate consumer data and billing logic using different classes.

## Features

* Stores consumer details such as ID, Name, and Units Consumed.
* Calculates bill amount using slab-based rates.
* Adds fixed charges of ₹125 to every bill.
* Validates input and handles negative unit values.
* Displays consumer information and total bill amount.

## Technologies Used

* Java
* Object-Oriented Programming (OOP)

## OOP Concepts Used

### Class

* 'Consumer' class for storing consumer information.
* 'TariffCalculator' class for bill calculation.

### Object

* Consumer and TariffCalculator objects are created and used in the program.

### Encapsulation

* Consumer data members are declared private and accessed through getter methods.

### Object Interaction

* The TariffCalculator class uses a Consumer object to calculate and display the bill.

## Tariff Slabs

| Units Consumed | Rate per Unit |
| -------------- | ------------- |
| 0 – 100        | ₹1.50         |
| 101 – 200      | ₹2.50         |
| 201 – 300      | ₹4.00         |
| Above 300      | ₹6.00         |

**Fixed Charges:** ₹125

## How to Run the Program

### Compile

-bash
javac ElectricityBillSystem.java


### Run

-bash
java ElectricityBillSystem


## Sample Output


Consumer ID: 101
Name: Rahul
Units Consumed: 250
Total Electricity Bill: 725.0


## Advantages

* Simple and easy to understand.
* Demonstrates important OOP concepts.
* Accurate slab-based bill calculation.
* Easy to modify tariff rates and fixed charges.

## Future Enhancements

* Accept user input using Scanner.
* Generate bills for multiple consumers.
* Store consumer records in files or databases.
* Add GST and other charges.
* Create a graphical user interface (GUI).

## Conclusion

The Electricity Bill Calculation System successfully calculates electricity bills using slab-based tariff rates and fixed charges. The project demonstrates Java Object-Oriented Programming concepts such as encapsulation, classes, objects, and object interaction while providing a practical solution for electricity bill management.

 
