
public class Nonstatic {

	int v=8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nonstatic x=new Nonstatic(); //instance of an object
x.car();
x.flower();
x.massaddition(88, 0, 90, 65);
	}
	
public void car() { //non static function because we did not mention static here.
	
	System.out.println("TOYOTA");
	System.out.println(v);
}


public static void flower() {
	
	System.out.println("I like rose.");
}

public void massaddition(int a, int b, int c, int d) {
	int add = a+b+c+d;
	System.out.println(add);
}

}
