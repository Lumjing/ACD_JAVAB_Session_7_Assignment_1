package assignment7_1;
import java.util.*;
//This assignment will test your knowledge on String class and its methods
public class Assignment7_1    
		{
			public static void main(String[] args)      
			{
				int inputNumber;       //int variable to store the input number.
				String convertedString;      //String object to store the converted String.
				
				System.out.println("Enter the integer that you want to convert in the String");
				// input from user using scanner class under util package		        		
				
					Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
				
				inputNumber=sc.nextInt();      	
				//For converting String from int , We are using valueOf() function of string class which will directly convert int to String.
				convertedString=String.valueOf(inputNumber);        //We are passing inputNumber in the valueOf function.
				
				System.out.println("\n int Converted to String and made "+convertedString);      //Printing Statement.
				
				sc.close();        //Closing the object of Scanner class.
				
			}     //End of main function.

		}    //End of class.

	


