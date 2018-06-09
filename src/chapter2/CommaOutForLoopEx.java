package chapter2;

public class CommaOutForLoopEx {

	public static void main(String[] args) {
		java.util.List<String> names = new java.util.ArrayList<String>();
		names.add("Lisa"); // [0]
		names.add("Kevin"); // [1]
		names.add("Rodger"); // [2]
			
		//Reason for using names.size() is because above is a LIST and not an Array
	
		
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if(i > 0) {
				System.out.print(", ");
			}
					System.out.print(name);
		}

	}

}
