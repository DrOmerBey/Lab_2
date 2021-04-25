package Assignments_Lab_2;

import java.util.Scanner;

public class Ques5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the charge for your meal: ");
		double charge=sc.nextDouble();
		
		double tax = charge*6.75/100;
		double tip = (charge+tax)*20/100;
		double total = charge + tax + tip;
		
		System.out.println("charge is calculated: " + charge);
	
		System.out.println("Tax is calculated: " + tax);
		System.out.println("Tip is calculated: " + tip);
		System.out.println("Your Total is: " + total);

	}

}
