package PrintLoops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class StringReverse {
	static String Exce;
	public StringReverse() {
		System.out.println("Enter a string:\n");
		Scanner input = new Scanner(System.in);
		String X=input.nextLine();
		Exce=X;
		System.out.println("************************************\n"
				+ "****************************");
		mainRunner(Exce);
	}
	public StringReverse(String X) {
		Exce=X;
		System.out.println("************************************\n"
				+ "****************************");
		mainRunner(Exce);
	}
public static void mainRunner() {
	System.out.println("Enter a string:\n");
	Scanner input = new Scanner(System.in);
	String X=input.nextLine();
	Exce=X;
	System.out.println("************************************\n"
			+ "****************************");
	mainRunner(Exce);
		
		
	}

	public static void mainRunner(String String) {
		
		// TODO Auto-generated method stub
		String MyString=String;
		
		System.out.println("There are so many ways to reverse a string");
		ReverseString1(MyString);
		System.out.println("************************************\n"
								+ "****************************");
		ReverseString2(MyString);
		System.out.println("************************************\n"
				+ "****************************");
		ReverseString3(MyString);
		System.out.println("\n************************************\n"
				+ "****************************");
		ReverseString4(MyString);
		System.out.println("************************************\n"
				+ "****************************");
		ReverseString5(MyString);
		System.out.println("\n************************************\n"
				+ "****************************");
		ReverseString6(MyString);
		System.out.println("************************************\n"
				+ "****************************");
	}

	public static void ReverseString1(String String) {
		System.out.println("Converting String into Bytes:");
		String input = String; 
	    System.out.println("String to reverse = " + input); 
        // getBytes() method to convert string  
        // into bytes[]. 
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
  
        System.out.println(new String(result)); 
	}
public static void ReverseString2(String String) {
	System.out.println("Using built in reverse() method of the StringBuilder class:");
	 String input = String; 
	    System.out.println("String to reverse = " +input); 
     StringBuilder input1 = new StringBuilder(); 

     // append a string into StringBuilder input1 
     input1.append(input); 

     // reverse StringBuilder input1 
     input1 = input1.reverse(); 

     // print reversed String 
     System.out.println(input1); 
		
	}

public static void ReverseString3(String String) {
	System.out.println("Converting String to character array:");
	String input = String; 
    System.out.println("String to reverse = " + input); 
    // convert String to character array 
    // by using toCharArray 
    char[] try1 = input.toCharArray(); 

    for (int i = try1.length-1; i>=0; i--) 
        System.out.print(try1[i]);
	
}

public static void ReverseString4(String String) {
	System.out.println("\nConvert the input string into character array by using the toCharArray():");
	String input = String; 
    System.out.println("String to reverse = " +input); 
    char[] temparray = input.toCharArray(); 
    int left, right=0; 
    right = temparray.length-1; 

    for (left=0; left < right ; left++ ,right--) 
    { 
        // Swap values of left and right 
        char temp = temparray[left]; 
        temparray[left] = temparray[right]; 
        temparray[right]=temp; 
    } 

    for (char c : temparray) 
        System.out.print(c); 
    System.out.println();
	
}
public static void ReverseString5(String String) {
	System.out.println("Using ArrayList object:");
	 String input = String; 
	    System.out.println("String to reverse = " + input); 
     char[] hello = input.toCharArray(); 
     List<Character> trial1 = new ArrayList<>(); 

     for (char c: hello) 
         trial1.add(c); 

     Collections.reverse(trial1); 
     ListIterator li = trial1.listIterator(); 
     while (li.hasNext()) 
         System.out.print(li.next());
	
}
public static void ReverseString6(String String) {
	System.out.println("Using built in reverse() method of the StringBuffer class:");
	StringBuffer sbf = new StringBuffer(String); 
    System.out.println("String to reverse = " + sbf); 
      
    // Here it reverses the string buffer 
    sbf.reverse(); 
    System.out.println("String buffer after reversing = " + sbf); 
}
}
