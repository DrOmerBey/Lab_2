package Assignments_Lab_2;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		
		int choice, nextNum, small=0, larg=0;
		boolean control=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int firstNum = sc.nextInt();

		
		do {		
			System.out.print("Enter your next number: ");
			nextNum =sc.nextInt();
			
			if (nextNum >= firstNum && control) {
				small = firstNum;
				larg = nextNum;
				control = false;
			}
			if (nextNum < firstNum && control) {
				small = nextNum;
				larg = firstNum;
				control = false;
			}
			
			if (nextNum >= small) {
				larg = nextNum;
			}
			if (nextNum <= small) {
				small = nextNum;
			}			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			choice = sc.nextInt();
			
		}while (choice==1);
		
		
		System.out.println("Smallest Number: " + small);
		System.out.println("Largest Number: " + larg);


	}

}
