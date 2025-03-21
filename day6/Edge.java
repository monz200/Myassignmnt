package week3.day6;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println(" takeSnap() is done----->superclass");
	}
	
	public void clearCookies() {
		System.out.println(" clearCookies() is done----->superclass");
	}
	public static void main(String[] args) {
		Edge e=new Edge();
		e.takeSnap();
		e.closeBrowser();
	}

}
