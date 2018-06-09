package postClassPractice;

public class AddingStrings {

	public static void main(String[] args) {
			String a = "ok";
			a+=2;
			a+='c';
			a+= false;
			if (a == "2cfalse") 
				System.out.println("==");
			if(a.equals("2cfalse"))
				System.out.println("equals");
	}

}
