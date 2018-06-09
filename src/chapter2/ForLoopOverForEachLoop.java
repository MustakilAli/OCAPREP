package chapter2;

public class ForLoopOverForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] values = new int [3];
		values [0] = 10;
		values [1] = new Integer (5);
		values [2] = 15; 
		
		for (int i = 1; i < values.length; i++) {
			System.out.println(values[i] - values[i-1]);
		} 

	}

}
