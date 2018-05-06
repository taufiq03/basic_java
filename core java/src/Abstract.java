// when you have abstract method in any class, it becomes an abstract class
// abstract method means you know your functions but don't know the actions of that functions
public abstract class Abstract {
	
	public static void color() {
		
		System.out.println("green is my favorite color");
		
	}
 
	public static void food() {
		System.out.println("I like pie");
	}
	
	public static void addition(int a, int b) {
		
		int add=a+b;
		System.out.println(add);
	}
	public abstract void dinner();
	public abstract void country();
	
}
