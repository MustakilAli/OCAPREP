package chapter3;

public class UsingStringBuilderClass {

	public static void main(String[] args) {
			
//		String alpha = "";
//		for (char current = 'a'; current <= 'z'; current++) {
//			alpha += current;
//			System.out.println(alpha);
//		}
		
		//Using String Builder Class
		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++) {
			alpha.append(current);
			System.out.println(alpha);
		}
		
		
		
	}

}
