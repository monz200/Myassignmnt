package week3.day6;

public class Safari extends Browser{
 
	public void readerMode(){
		System.out.println(" readerMode() is done----->superclass");
	}
	
	public void fullScreenMode() {
		System.out.println(" fullScreenMode() is done----->superclass");
	}
	
	public static void main(String[] args) {
		Safari s=new Safari();
         s.closeBrowser();
	}

}
