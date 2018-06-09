package chapter4;

import java.util.*;
import java.util.function.*;

public class AnimalPredicateLambda {

	public static void main(String[] args) {
		List <Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Fish", false, true));
		
		print(animals, a -> a.canHop());
		
	}
	private static void print (List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if(checker.test(animal))
				System.out.println(animal + " ");
		}
		System.out.println();
	}

}
