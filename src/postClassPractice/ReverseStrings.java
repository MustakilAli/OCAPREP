package postClassPractice;

import java.util.Scanner;

public class ReverseStrings {




public static void reverseString(){
	/*String input = "Gautham"*/;
	System.out.println("Enter the String Value");
	Scanner scanner = new Scanner(System.in);
	String input1 = scanner.nextLine();
	scanner.close();
	String reverse= "";
	int len = input1.length();
	char[] inChar = input1.toCharArray();
	for(int i=len-1 ; i>=0;i--){
		reverse = reverse+inChar[i];
	}
	System.out.print("The Reverse of the entered string value is "+reverse);
}

}

