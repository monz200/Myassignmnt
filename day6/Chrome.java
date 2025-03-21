package week3.day6;

public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println(" openIncognito() is done----->superclass");
	}
	
	public void clearCache() {
		System.out.println(" clearCache() is done----->superclass");
	}
	
	
	
	public static void main(String[] args) {
		Chrome c=new Chrome();
				c.clearCache();
		        String bro = c.browserName;

	}

}
