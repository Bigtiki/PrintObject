package PrintLoops;

import java.util.Scanner;

public class TrianglePrint {

	public static void main(String[] args) {
		 int X =RowNumber();
		 String Word = RowWord();
		 PrintTriangle(X, Word);
	}
	
	
	public static int RowNumber() {
		int number=0;
		try {
			
		Scanner input = new Scanner(System.in);
			System.out.println("Enter a Number");
			number = input.nextInt();
			System.out.println("Entered Number is: "+ number);
			input.close();
			return number;
		}catch(Exception e) {
			System.out.println("Enter a valid number: ");
			RowNumber();
		}
		
		return number;
		
	}
	
	
	public static String RowWord() {
		String word=null;
		Scanner input = new Scanner(System.in);
			System.out.println("Enter a Word:\n");
			word = input.nextLine();
			System.out.println("Entered Word is: "+ word);
			input.close();
			return word;
		
	}
public static void PrintTriangle(int n, String Word) {
	for (int i=0; i<n; i++) 
	{
		System.out.print(" ");
		for(int j=n-i;j>1; j--) {
			
			
			System.out.print(". ");
		}
			for(int j=0;j<=i; j++) {
			
			
			System.out.print(Word);
		}
		
		
		System.out.println(">");
	}
}
}
