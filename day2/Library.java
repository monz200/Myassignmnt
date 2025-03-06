package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library add = new Library();
		Library issue = new Library();
		System.out.println(add.addBook("bookTitle"));
		issue.issueBook();
			

	}
	
	public static String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public static void issueBook() {
		System.out.println("Book issued successfully");
	}
}

