import java.util.Scanner;

public class Conversion {

	public static double convert(double amount) {
		// Write the body of this method.
		double euro = amount / 1.24;
	    return euro;
	  }
	  public static void main(String[] args)
	  {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter amount $: ");
	    double amount = input.nextDouble();
	    System.out.println("In Euro: ");
	    System.out.print(convert(amount));
		
		
		
	}

}
/*
Example: output of the amount $150 
----------------------------------
Enter an amount in dollars: 
150
In euro: 127.11
*/