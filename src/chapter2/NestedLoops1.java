package chapter2;

public class NestedLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		while (x>0) {
			do {
				x -= 2;
			} while (x>5);
			x--;
			System.out.print(x+ "\t");
		}

	}

}
