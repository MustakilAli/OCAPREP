package chapter4;

//About Chaining Constructors 
// COMMON TECHNIQUE is to have each constructor add one parameter until getting to the constructor that does all the work.
// Build your way up to first constructor and have method (print()) that prints all what you put in constructor(s).

public class ChainingConstructors {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	
	
	
	public ChainingConstructors(int weight)	{
		this(weight, 16);
	}
	
	

	public ChainingConstructors(int weight, int numTeeth) {
		this(weight, numTeeth, 6);
	}


	public ChainingConstructors(int weight, int numTeeth, int numWhiskers) {
		this.weight = weight;
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
	}

	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}




public static void main(String[] args) {
	ChainingConstructors lo = new ChainingConstructors(15);
	lo.print();
	}

}
