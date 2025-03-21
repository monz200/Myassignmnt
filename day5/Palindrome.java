package week3.day5;

public class Palindrome {

	public static void main(String[] args) {
		int lastDigit,sum=0,a;    
		int inputNumber=185; //It is the number  to be checked for palindrome 
 
		a=inputNumber; 
        
        // Code to reverse a number
	for( ;a != 0; a /= 10 )
		{   System.out.println("The Input Number is "+a);  
			lastDigit=a%10; //getting remainder  
			System.out.println("The Last Digit is "+lastDigit); 
			System.out.println("Last Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			sum=(sum*10)+lastDigit;  
			a=a/10;
			
		}    
 
		// if given number equal to sum than number is palindrome otherwise not palindrome
		if(sum==inputNumber)    
			System.out.println("No is palindrome ");    
		else    
			System.out.println("No is not palindrome");    
 
	}

	}

