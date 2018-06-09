package chapter3;

import java.util.ArrayList;
import java.util.Collections;

public class ElevenStringMethods {

	public static void main(String[] args) {
		String string = "aNimaLs";
		//length() --> Returns the number of characters in the String 
		System.out.println(string.length()); 
		
		//charAt() --> Returns the character at requested index 
		System.out.println(string.charAt(0));
		System.out.println(string.charAt(6));
		
		//indexOf() --> Returns the index at requested character 
		System.out.println(string.indexOf('a'));
		System.out.println(string.indexOf("al"));
		System.out.println(string.indexOf('a', 4)); // indicates that java shouldn't even look at the characters until it gets to index 4
		System.out.println(string.indexOf("al", 5 )); // doesn't find anything because it starts looking after "al" has already been found (before index 5) -- resulting in a -1 
		
		//substring() --> Returns characters that are part(s) of string
		System.out.println("SubString Method Below:");
		System.out.println(string.substring(3));
		System.out.println(string.substring(string.indexOf('m'))); //calls the indexOf method because at times you may not know the index in advance
		System.out.println(string.substring(3, 4)); //just want one character
		System.out.println(string.substring(3, 7)); //(3, 8) would throw an exception error 
		
		//toLowerCase() / toUpperCase ---> Does exactly as it sounds
		System.out.println("Using Lower/Upper Case Method Below:");
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		System.out.println("HeLlowOrLd".toLowerCase());
		
		//equals() --> checks if the string contains the same characters in the same order
		//equalsIgnoreCase() --> checks if two strings contains the same characters with exception of converting the characters' if needed
		System.out.println("abc".equals("ABC")); //False
		System.out.println("ABC".equals("ABC")); //True
		System.out.println("abc".equalsIgnoreCase("ABC")); //True
		
		System.out.println("------------");
		System.out.println("Comparing ArrayList to see if equals order of values. True/False:");
		ArrayList <Integer> ls1 = new ArrayList<>();
		ls1.add(22);
		ls1.add(3);
		ls1.add(4);
		ArrayList <Integer> ls2 = new ArrayList<>();
		ls2.add(22);
		ls2.add(4);
		ls2.add(3);
		
		System.out.println(ls1.equals(ls2));
		System.out.println("------------");

		
		
		//startsWith() --- endsWith() ---> Checks if provided value in parameter matches with STRING
		System.out.println("abc".startsWith("a"));
		System.out.println("abc".startsWith("A"));
		System.out.println("abc".endsWith("c"));
		System.out.println("abc".endsWith("a"));
		
		//contains () --- checks for matches in ANYWHERE in the String 
		System.out.println("Contains Method Below:");
		System.out.println("abc".contains("b"));
		System.out.println("abc".contains("B"));
		
		//replace() --- search and replaces on the String
		System.out.println("Replace Method Below:");
		System.out.println("abcabc".replace('a', 'A'));
		
		//trim() --- removes whitespace before and after a String
		System.out.println("Trim Method Below:");
		System.out.println("abc".trim()); //No whitespace but the method is valid 
		System.out.println("\t    a b c".trim()); //AWESOME WOAH
		
		
		//split() --- 
		String lv = "I Love You";
		String [] lo = lv.split(" ");
		for (int i = 0; i < lo.length; i++) {
			System.out.println(lo[i]);
		}
	
		
		
		
		
		
		
		
		
		
	
		
	}

}
