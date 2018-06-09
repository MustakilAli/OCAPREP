package chapter3;

import java.util.Arrays;

public class RemoveLastComma {

	public static void main(String[] args) {
		int [] numbers = {6,9,1,0};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if (i>0) {
				System.out.print(",");
			}
				System.out.print(numbers[i]);
		}
	}

}
