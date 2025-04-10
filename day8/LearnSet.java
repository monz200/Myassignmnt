package week4.day8;

import java.util.HashSet;
import java.util.Set;
public class LearnSet {

	public static void main(String[] args) {
		
		String name="Saranya";
		char[] charArray = name.toCharArray();
		
		//declare an empty set
		//syntax:interface<wrapperclass> setname=new imp.class<wrapperclass>();
		
		Set<Character> unique=new HashSet<Character>();
		Set<Character> duplicates=new HashSet<Character>();
		
		
		for (int i = 0; i < charArray.length; i++) {
			
			boolean b = unique.add(charArray[i]);
			
			if(!b) {
				duplicates.add(charArray[i]);
			}
			
			
		}
		System.out.println("unique characters are:"+unique);
		System.out.println("dulpicate characters are:"+duplicates);

	}

}
