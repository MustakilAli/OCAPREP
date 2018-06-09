
package chapter4;


/*
 * BOOLEAN - 1bit
 * BYTE -    8 bit	
 * CHAR -    16 bit
 * SHORT -   16 bit
 * INT -     32 bit
 * LONG -    64 bit
 * FLOAT -   32 bit
 * DOUBLE -  64 bit
 */

public class AutoBoxing {
	
//	public void fly (int i ) {
//		System.out.print("int ");
//	}
//	
//	public void fly (long l) {
//		System.out.print("long");
//	}
	
	public void fly(String s) {
		System.out.println("string ");
	}
	
	public void fly(Object o) {
		System.out.println("object ");
	}
	
	
	
	
	

	public static void main(String[] args) {

		AutoBoxing x = new AutoBoxing();
//		x.fly("Love");
//		x.fly(123L);
//		
//		x.fly((int) 123L); //simply cast if you want java to compile to a more narrow type. long > int . . . hence ,cast.
		
		
		x.fly("test");
		x.fly(56); //java will simply AUTOBOX object value into int considering there wasn't a method that fit the input. 
		
		
	}

}
