package lab2;

import java.util.Scanner;

public class Q02_Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Question-2

		A bag of cookies holds 40 cookies. The calorie information on the bag claims that there 
		are 10 serving in the bag and that a serving equals 300 calories. write a program that 
		lets the user enter the number of cookies he or she actually ate and then reports the number 
		of total calories consumed.*/
		
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the number of cookies you ate:");
		int numCookies=sca.nextInt();
		int cookiesNummberInOneServing=40/10;
		int calorieOfOneCookies=300/cookiesNummberInOneServing;
		int sumCalories=numCookies*calorieOfOneCookies;
		System.out.println("The number of calories you consumed is:"+sumCalories);
		
	}

}
