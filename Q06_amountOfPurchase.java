package lab2;

import java.util.Scanner;

public class Q06_amountOfPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-6

		Write a program that will ask the user to enter the amount of a purchase. 
		The program should then compute the state and county tax sales tax. 
		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
		The program should display the amount of the purchase , the state sales tax,
		 the county sales tax, the total sales tax, and the total of the sale 
		 (which is the sum of the amount of purchase plus the total sales tax)*/
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter pls the amount of purchase:");
		double amountOfPurchase=sca.nextInt();
		double stateSaleTax=(0.04)*amountOfPurchase;
		double countySaleTax=(0.02)*amountOfPurchase;
		double totalSaleTax=countySaleTax+stateSaleTax;
		double totalOfSale=amountOfPurchase+totalSaleTax;
		System.out.println("The amount of purchase:"+amountOfPurchase);
		System.out.println("The amount of state sale tax:"+stateSaleTax);
		System.out.println("The amount of county sale tax:"+countySaleTax);
		System.out.println("The total of sale:"+totalOfSale);
		 
	}

}
