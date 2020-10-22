package lab2;

import java.util.Scanner;

public class Q01_largesSmallestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Question-1
		Write a program with a loop that lets the user enter a 
		series of integer numbers. After all the numbers have been 
		entered, the program should display the largest and smallest 
		numbers entered.
	
	1*/Scanner sca =new Scanner(System.in);
	 int smallestNumber=0;
	 int largestNumber=0;
	  System.out.print("Enter your first number:");
	  int num=sca.nextInt();
	smallestNumber=num;
	  System.out.print("Enter your next number:");
		 num=sca.nextInt();
	if(num<=smallestNumber) {
		smallestNumber=num;
	}else {
		largestNumber=num;
	}

		int n=100;
		for(int i=1; i<=n; i++) {
			 
			
			 System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			 int answer=sca.nextInt();
			 if(answer==1) {
				 System.out.print("Enter your next number:");
				 num=sca.nextInt();
				 if(num<=smallestNumber) {
						smallestNumber=num;
					}else if(num>=largestNumber) {
						largestNumber=num;
					}
			 }else if(answer==0) {
				 System.out.println("Smallest number is:"+smallestNumber);
				 System.out.println("Largestt number is:"+largestNumber);
				 return;
			 }
		}
		
		}

}
