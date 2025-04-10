package week4.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		//to initialize an array of elements
				int[] array = {1, 2, 3, 4, 10, 6, 8};
				//to declare the list
				List<Integer> list = new ArrayList<Integer>();
				//to add the array elements to list
				for(int i=0; i<array.length; i++)
					list.add(array[i]);
				//to sort the list elements
				Collections.sort(list);
				//to iterate from first value to before the last value of the list 
				System.out.println("Missing elements:");
				for(int i=0; i<(list.size()-1); i++)
				{
					//to get the current value
					int present = list.get(i);
					//to get the next value
					int next = list.get(i+1);
					//to print the value, which is not in sequence
					if(next != present+1)
						System.out.println(present+1);
				}
	}

}
