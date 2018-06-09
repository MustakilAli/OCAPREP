package chapter4;

/* 1st. SuperClass
 * 2nd. Static variable declarations and Static Initializers 
 * 3rd. Instance Variable Declarations and Instance Initializers 
 * 4th. Constructor 
 * 
 */

public class InitializationOrderStatic {
	static { add(2); } //Static Variable (1st print)
	
	static void add (int num) {
		System.out.print(num + " ");  //Static Method
	}
	InitializationOrderStatic() { //New Constructor
		add(5); //(5th print)
	}
	
	static {add(4);} //Static Variable (2nd print)
	
	{add(6);} //Instance Variables (3rd print)
	
	static {new InitializationOrderStatic();} //Static - bringing new Object initializer 
	
	{add(8);} //Instance Variables (4th print)
	
	
	

	public static void main(String[] args) {
	

	}

}
