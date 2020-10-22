package lab2;

import java.util.Scanner;

public class Q03_nonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *Question-3

Write a program that asks the user for a positive nonzero integer value. 
The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
 */
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter a positive nonzero number:");
		int sum=0;
		int num=sca.nextInt();
		if (num>0) {
		for (int i=1; i<=num; i++) {
			sum+=i;
			}
		System.out.println("The sum of the numbers between 1 up to your input number is:"+sum);
		}else if(num<=0) {
				System.out.println("Invalid input!");
				
			}
			
		}
		
	}


