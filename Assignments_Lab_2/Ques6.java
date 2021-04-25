package Assignments_Lab_2;

import java.util.Scanner;

public class Ques6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the amount of purchase: ");
		double price=sc.nextDouble();
		
		double stateTax = price*4/100;
		double countyTax = price*2/100;
		double totalTax = stateTax + countyTax;
		double totalPrice = price + totalTax;
		
		System.out.println("item price: "+ price);
		System.out.println("state tax: "+ stateTax);
		System.out.println("county tax: "+ countyTax);
		System.out.println("total tax: "+ totalTax);
		System.out.println("total purchase price:" +totalPrice);

	}
}
