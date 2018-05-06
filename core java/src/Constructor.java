// Constructor is an instance method that usually has the same name as the class.
//and is used for assigning a new default value
//Constructor should be always non static.
// Static variable can not be used as constructor
public class Constructor {
	
	int age; //non static global variable
	int Salary;
	int House;
	String name;
	
	Constructor(){
		int age=47;
		int Salary=10000;
		int House=7;
		String name="John";
		
		System.out.println(age);
		System.out.println(Salary);
		System.out.println(House);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor x= new Constructor();
		
		

	}

}
