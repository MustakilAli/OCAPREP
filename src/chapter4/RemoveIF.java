package chapter4;

import java.util.*;

public class RemoveIF {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);  //[long ear, floppy, hoppy]
		
		
		System.out.println("Bunny List after removing names that DONT start with letter 'h'");
		bunnies.removeIf(s->s.charAt(0) != 'h');
		System.out.println(bunnies);
		
		
		
	}

}

