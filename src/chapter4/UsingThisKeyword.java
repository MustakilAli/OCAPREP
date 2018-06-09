package chapter4;

public class UsingThisKeyword {
	
	private String color;
	private int height;
	private int length;
	
	
	public UsingThisKeyword (int length, int theHeight) {
//		length  = this.length; //backwords! no good! 
		
		this.length = length; //proper way
		
		height = theHeight; //fine because using a difference name
		
		this.color = "white"; //fine, but not useful
	}
	
	
	
	
	

	public static void main(String[] args) {
			
		UsingThisKeyword b = new UsingThisKeyword(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}

}
