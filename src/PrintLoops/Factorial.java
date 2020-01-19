package PrintLoops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int x = FactorialOf();
	FactorialOf(x);
	}
	
	public static int FactorialOf() {
		int number =0;
		System.out.println("Enter a number:\n");
		Scanner input = new Scanner(System.in);
		try {
		number = input.nextInt();
		}catch(Exception e) {
			System.out.println("Enter a valid Number");
		}
		

		return number;	
	}
	
public static void FactorialOf(int numb) {
	int i,fact=1;
	int number =numb;

	for(i=1;i<=number; i++) {
		fact =fact*i;
		System.out.println("Factorial of "+i +" is: "+fact);
	}
	System.out.println("|\n|\n|Factorial of "+number +" is: "+fact+"|\n|\n|");
}
}
