package week4.day7;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		/*
		 * syntax: List<genric> listname=new impl.class<gener>();
		 */
		
		
		List<String> mentors=new ArrayList<String>();
		List<String> coach=new ArrayList<String>();
		coach.add("Babu");
		System.out.println(coach);
		
		//add items in the list
		mentors.add("vinoth");
		mentors.add("Bhuvanesh");
		mentors.add("Muthu");
		mentors.add("kathir");
		mentors.add(2, "mukesh");
		mentors.add("muthu");
		System.out.println(mentors);
		
		mentors.add("Anburaj");
		mentors.add("harish");
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
			
		}
		
		//size of list
		int size = mentors.size();//size starts from1
		System.out.println(size);
		//retreive a particular item in alist
		String menName= mentors.get(6);
		System.out.println(menName);
		
		//remove
		String remove = mentors.remove(1);
		System.out.println(remove);
		
		//add one list into anotherlist
		coach.addAll(mentors);
		System.out.println(coach);
		coach.clear();
		System.out.println(coach);
		
		
		
	}

}
