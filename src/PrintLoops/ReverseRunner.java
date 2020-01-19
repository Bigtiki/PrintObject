package PrintLoops;

import java.util.Scanner;

public class ReverseRunner {
		public static void main(String[] args) {
			runProgram();
			
}
		public static void runProgram() {
			StringReverse.mainRunner("WORD ARE FLIPPING");
			StringReverse NewString = new StringReverse();
			NewString.mainRunner(NewString.Exce);
			ContinueProg();
		}
		public static void ContinueProg() {
			System.out.println("DO YOU WANT TO CONTINUE>>>>???|\n TYPE:\t\tYES or NO");
			Scanner input= new Scanner(System.in);
			String ContinueRunning=input.nextLine();
			switch(ContinueRunning.toUpperCase()) {
			case "YES":
				runProgram();
				break;
			case "NO":
				System.out.println("Good Bye");
				StringReverse.mainRunner("DO YOU WANT TO CONTINUE>>>>???|\n TYPE:\t\tYES or NO");
				break;
			default:
				
				ContinueProg();
		}
			System.out.println("End Reverse String! "+ StringReverse.Exce);
			}
		
		
	}
