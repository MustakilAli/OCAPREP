package chapter4;

import java.util.ArrayList;

public class ArrayListMethodUsage {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		
		System.out.println(total(list));
		
		
		
		
	}
	
	
	public static int total(ArrayList<Integer> nums) {
		int total = 0; //<--- local variables don't have default values - so it must be declared 
		
		for (int i : nums ) {
			total += i;
		}
		return total;
	}

}
