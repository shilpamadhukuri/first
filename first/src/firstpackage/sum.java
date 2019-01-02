package firstpackage;

import java.util.Scanner;

public class sum {
	 static int Num1;
	 static int Num2;
	 

	 @SuppressWarnings("resource")
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the firstno");
		 Num1 = input.nextInt();
		System.out.print("Enter the secno");
		Num2 = input.nextInt();
			   
		 int SUM = Num1+Num2;
		 
		 
		 System.out.print("Sum of two numbers is " +SUM);
		 
	 }
}
