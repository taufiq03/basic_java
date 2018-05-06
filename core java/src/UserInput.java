import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for String
Scanner reader=new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name=reader.next();
		System.out.println("Your name is "+name);
		
		//for integer value
	Scanner reader1=new Scanner(System.in);	
	System.out.println("How old are you?");
	
	try {
	int age=reader1.nextInt();
	System.out.println("Your age is "+age);
	
		
	// for double value
	Scanner reader2=new Scanner(System.in);
	System.out.println("How tall are you?");
	double height=reader2.nextInt();
	System.out.println("your height is "+height);
	}catch(Exception e) {System.out.println("need to give numerical value");}	
	
	finally {
		System.out.println("thanks for using this program");
	}
	}
}
	
