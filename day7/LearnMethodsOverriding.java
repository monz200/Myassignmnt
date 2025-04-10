package week4.day7;

public class LearnMethodsOverriding extends LearnMethodOverloading {
	
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		LearnMethodsOverriding lm=new LearnMethodsOverriding();
		lm.add();
		lm.add(3, 3, 4.4f);
	}

}
