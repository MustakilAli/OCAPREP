package chapter1;

//This program will focus on Order of Initialization 
//1. Fields and instance initializers blocks are run in the order in which they appear in the file 
//2. The Constructor will runs after all fields  and instance initializer blocks have run. 



public class Chick {
	private String name = "Fluffy"; //PROGRAMMING STEP 2: Java will Initialize this First 
	{System.out.println("Setting Field");   }  //PROGRAMMING STEP 3: setting up java to initialize this instance initializer block field FIRST
	public Chick () { //CONSTRUCTOR -- Introduced
		name = "Tiny"; // PROGRAMMING STEP 4: will 
		System.out.println("Setting Constructor");
	}
	public static void main(String[] args) {   //PROGRAMMING STEP 1: Java program will start here with the MAIN METHOD 
		Chick chick = new Chick(); //This is the new object field that is the source of the latest initialization 
		System.out.println(chick.name); //PROGRAMMING STEP FINAL: Will print 
		
	}
	

}
