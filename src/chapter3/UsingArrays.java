package chapter3;

import java.util.Arrays;

public class UsingArrays {

	public static void main(String[] args) {
			String[]strings = {"stringValue"};
			Object[]objects = strings;
			//Casting objects to String [] 
			String[]againStrings = (String[]) objects;
			//Will NOT Compile because you cannot convert from a StringBuilder to String. 
//			againStrings[0] = new StringBuilder();
			//objects[0] = new StringBuilder(); //java.lang.ArrayStoreException (will throw an exception because you casted your objects array to string array, 
												// Object [] objects does not technically exist because of casting. 
			
			
		String[] str = {"10", "9","100"};
		Arrays.sort(str);
		for (String string : str) {
			System.out.print(string + " ");
			
		}
			
		
		System.out.println();
		
		int [] numbers = {1,6,8,3,4,7,8};
		Arrays.sort(numbers); 
		//[1,3,4,6,7,8,8];
		System.out.println(Arrays.binarySearch(numbers, 4));
			
	}

}
