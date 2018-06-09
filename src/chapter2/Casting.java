package chapter2;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//

		short x = 10;
		short y = 3;
		int z = x * y; 
		///was short z = x * y; but since the compiler already promotes any small numerical value data type to INT - you must put int z = x * y;
		/// or you can simply cast it...
		
		short i = 10;
		short o = 3;
		short l = (short) (i * o);
		
		
		
		System.out.println("Output after compiler promotes short to int automatically:  "+z);
		System.out.println("Output after casting short in Output: " + l);
		

		
	}

}
