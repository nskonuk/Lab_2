package lab2;

import java.util.Scanner;

public class Q05_restaurantBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-5

Write a program that computes the tax and tip on a restaurant bill. 
The program should ask the user to enter the charge for the meal. 
The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total after adding tax.
 Display the meal charge, tax amount, tip amount, and total bill on the screen.
 */
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter pls the charge of the meal:");
		double chargeOfMeal=sca.nextInt();
		double tax=(6.75/100)*chargeOfMeal;
		double tipAmount= (chargeOfMeal+tax)/5;
		double totalBill=(chargeOfMeal+tax+tipAmount);
		System.out.println("The meal charge:"+chargeOfMeal);
		System.out.println("The tax amount:"+tax);	
		System.out.println("The tip amount:"+tipAmount);
		System.out.println("The total bill:"+totalBill);
		
	}

}
