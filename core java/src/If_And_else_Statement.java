
public class If_And_else_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=300;
		int j=200;
		int a=300;
		
		
		//System.out.println(j);
		//System.out.println(i);
		
		//Operators in Java =< ,>,=, <=,>=,!
		
	if (i<j)
	System.out.println("i is less than j");
	else
	System.out.println("i is not less than j");
	
	if (i<a)
		System.out.println("i is less than a");
	else
		System.out.println("i is not less than a");
	
	//
	if (i==a) //equal
	System.out.println("value of i and a are same");
	else
	System.out.println("value of i and a are not the same ");
	if (j>a)
		System.out.println("j is greater than a");
	if (j<a) //example, not worry about math.
	{
		System.out.println("j is greater than a");	
	}
	else
	{
		System.out.println("j is not greater than a");
	
	}
	
	if (!(i==a)) // not equal example
	{
		System.out.println("value of i and a are not equal");
	
	}
	else
	{
	 System.out.println("value of i and a are equal. " + "value of i is "+ i);
	 
	}
	String name ="john";
	String name1 ="Michael";
	if (name==name1)
	{
		System.out.println("both of the names are same");
		
	}
	else 
	{
		System.out.println("both names are not the same");
		
	}
	
	}
	
	

}
