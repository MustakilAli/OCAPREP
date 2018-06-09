package chapter3;

public class MethodChaining {

	public static void main(String[] args) {
		//STRING IS IMMUTABLE. 
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace("C", "3");
		System.out.println("a= " + a);
		System.out.println("b= "+ b);
		
		
		//STRINGBUILDER IS MUTABLE 
		StringBuilder c = new StringBuilder("abc");
		StringBuilder d = c.append("de");
		d = d.append("f").append("g");
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
