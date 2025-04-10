package week4.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		
		// Step 2: Creating two Lists with some common and distinct elements
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 2, 11, 4, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 8, 4, 9, 7));

        // Printing the original lists
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        // Step 3: Using retainAll() method to find the intersection
        List<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);
        System.out.println("Intersection using retainAll: " + intersection);


	}

}
