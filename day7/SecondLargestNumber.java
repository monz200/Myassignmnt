package week4.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		// Creating the array
        Integer arr[] = {3, 2, 11, 4, 6, 7};
        
        // Converts the array into a list
        List<Integer> list=Arrays.asList(arr);
        // Sorts the array in ascending order  
        Collections.sort(list);  
        // Prints the array elements
        System.out.println("The array elements are : "+Arrays.toString(arr));
        
        // Prints the second largest element
        System.out.println("The second largest element of the array is : "+list.get(arr.length-2));
	}

}
