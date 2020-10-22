package lab2;

import java.util.Scanner;

public class Q04_numberMaleAndFemale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-4

Write a program that asks user for the number of males and the number of females registered in a class. 
The program should display the percentage of males and females in the class.
 */
		Scanner sca= new Scanner(System.in);
		System.out.print("Enter the number of males:");
		int numOfMales=sca.nextInt();
		System.out.print("Enter the number of females:");
		int numOfFemales=sca.nextInt();
		double percentageOfMales=100*numOfMales/(numOfMales+numOfFemales);
		double percentageOfFemales=100*numOfFemales/(numOfMales+numOfFemales);
		System.out.println("The percentage of males in the class is:"+percentageOfMales);
		System.out.println("The percentage of females in the class is:"+percentageOfFemales);
	}

}
