package postClassPractice;

public class ReverseChar {
	public static void main(String[] args) {
		String input = "I---Love---Java.";
		String reverse = "";

		char[] a = input.toCharArray();
		System.out.println(input);
		for (int i = a.length - 1; i >= 0; i--) {
			reverse = reverse + Character.toString(a[i]);
			

		}
		System.out.println(reverse);

	}

}
