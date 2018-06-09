package chapter5;

//Calling Inherited Class Members

public class Shark extends Fish {

	private int numberOfFins = 8;
	
	 public Shark(int age) {
		 super(age);
		 this.size = 4;
	 }
	 
	 public void displaySharkDetails() {
		 System.out.print("Shark with age: "+getAge());
		 System.out.print(" and " + size + " meters long" );
		 System.out.println(" with "+ numberOfFins +" fins");
}
//	 
//	 public void displaySharkDetails() {
//		 System.out.print("Shark with age: "+ this.getAge());
//		 System.out.print(" and " + this.size + " meters long" );
//		 System.out.println(" with "+ this.numberOfFins +" fins");
//		 
//		 
	 
//	 public void displaySharkDetails() {
//		 System.out.print("Shark with age: "+ super.getAge());
//		 System.out.print(" and " + super.size + " meters long" );
////		System.out.println("with "+ super.numberOfFins + " fins"); cannot do this b/c value is only in sub class
//		 System.out.println(" with "+ this.numberOfFins +" fins");
// }


}

