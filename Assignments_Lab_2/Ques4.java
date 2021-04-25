package Assignments_Lab_2;

import java.util.Scanner;

public class Ques4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter number of males: ");
		int males=sc.nextInt();
		
		System.out.print("enter number of females: ");
		int females=sc.nextInt();
		
		int total=males+females;
		int maleRatio=(males*100)/(total);
		int femaleRatio=(females*100)/(total);
		
		System.out.println("male ratio is: "+maleRatio);
		System.out.println("female ratio is: "+femaleRatio);

	}
}
