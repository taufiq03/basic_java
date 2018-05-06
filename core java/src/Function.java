
public class Function extends Nonstatic{

	 static int t=4;//static global variable
	
	int z=9;//non static global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		country();
		state();
		age();
		addition(5,9,t);
		SocialSecurity();
		//massaddition(66,87,67,6);
		System.out.println(t);
		
		
	}

	public static void country () {
		
		System.out.println("I am from Mars.");
		System.out.println(t);
		
		Function b=new Function();
		System.out.println(b.z);
		
	}	
	
	public static void state() {
		
		System.out.println("I am from Texas." + t);
	}
	
	public static void age() {
		int x=9;
		System.out.println(x);
		
	}
	
	public static void addition(int a, int b, int t) {
		int add =a+b+t;
		System.out.println(add);
		
	}
	//public static void massaddition(int a, int b, int c, int d) {
		//int add = a+b+c+d;
		//System.out.println(add);
	
	
	public static void SocialSecurity() {
		
		System.out.println("My social security is 6787688");
	}
	}
	
	
	
	

