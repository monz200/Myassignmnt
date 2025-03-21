package week3.day6;

public class Browser {

	public String browserName, browserVersion;
	public void openURL() {
		System.out.println(" openURL is done----->superclass");
	}
	
	public void closeBrowser() {
		System.out.println(" closeBrowser() is done----->superclass");
	}
	
	public void navigateBack() {
		System.out.println(" navigateBack() is done----->superclass");
	}
	
	public static void main(String[] args) {
		Browser b=new Browser();
		b.navigateBack();
		b.navigateBack();
		b.getClass();
		
	}

}
