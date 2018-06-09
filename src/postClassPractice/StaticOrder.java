package postClassPractice;

public class StaticOrder {

	 private String name = "Torchie"; //Instance Field
	 { System.out.println(name); }  //Instance Block
	 private static int COUNT = 0; //Static Field
	 static { System.out.println(COUNT); } //Static Field
	 { COUNT++;  System.out.println(COUNT); } //Instance Block
	 public StaticOrder() {  					 //Constructor
		 System.out.println("constructor"); 
	 } 
	 public static void main(String[] args) { 
		 System.out.println("read to construct"); //Main Sysout
		 new StaticOrder(); 
//When new Constructor Object is created, the instance fields/methods will run all over again 
}
	
}
