package week3.day5;

public class OddIndex {

	public static void main(String[] args) {
		//Input Declaration
		String test="changeme";
		
		//Convert String to upper case
		String string = test.toUpperCase();
		System.out.println(string);
		
		
		//Convert odd index of Character to upper case
		char[] arr = test.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i%2!=0) {
				
				char upperCase = Character.toUpperCase(arr[i]);
				System.out.print(upperCase);
			}
			else {
				
				System.out.print(arr[i]);
			}
			
		}
	}

}
