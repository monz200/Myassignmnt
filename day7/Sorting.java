package week4.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		//to initialize an array of strings
				String[] names = {"HCL", "Wipro", "Aspire Systems", "CTS"};
				//to declare the list
				List<String> listNames = new ArrayList<String>();
				//to add the array elements to list
				for(int i=0; i<names.length; i++)
					listNames.add(names[i]);
				//to sort the list
				Collections.sort(listNames);
				System.out.println("The reversed list:");
				//to print the list values in reverse order
				for(int i=listNames.size()-1; i>=0; i--)
					System.out.println(listNames.get(i));

	}

}
