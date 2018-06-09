package postClassPractice;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		//I would like to see only for 3 and 5 and 7
		for (int num = 1; num <= 10; num++) {
			if (num != 3 && num != 5 && num != 7) {
				continue; 
				
			}
			
			
			//Nested For Loop
			for (int i = 1;  i<= 12; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
	
			}
			System.out.println("=====================");
		
		}
		

	}

}
