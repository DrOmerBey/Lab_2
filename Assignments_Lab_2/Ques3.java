package Assignments_Lab_2;

import java.util.Scanner;

public class Ques3 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter a positive nonzero number: ");
		
		 int nonzeronumber = sc.nextInt();
		 int sum=0;
		 
		 for(int i=1;i<=nonzeronumber;i++) {
			 sum+=i;
		 }
		 
		 System.out.println("total is: "+sum);
	}
	
}
