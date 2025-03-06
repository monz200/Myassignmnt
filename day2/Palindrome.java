package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121, rev = 0, rem;
	    
	    // store the number to original
	    int orig = num;
	    
	    // get the reverse of original
	    // store it in variable
	    while (num != 0) {
	      rem = num % 10;
	      rev = rev * 10 + rem;
	      num /= 10;
	    }
	    
	    // check if rev and orig are equal
	    if (orig == rev) {
	      System.out.println(orig + " is Palindrome.");
	}

	}
	
}
