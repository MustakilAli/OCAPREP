package chapter3;

public class StringBuilderMethods {
	
	
	public static void main(String[] args) {
		// There is 4 way to create a StringBuilder!
		// We have different kind of Constructors in StringBuilder!
		// We have no Argument Constructor or we have String,Char...  taking argument Constructors too!
		// This is our first StringBuilder object we created below with empty object.
				StringBuilder sb = new StringBuilder();
		// In StringBuilder we can add items with 'append' method!	
		//If you want to add more item you just keep calling 'append' method!
				//example
				sb.append("Butter");
				sb.append("Fly");
				//With append method literally you are not limited you can add all primitive data types and String,Object....! 
				//example with adding integer numbers.
				sb.append(123);
				//example with adding boolean.
				sb.append(true);
				//We can keep adding by chaining  append method after each one:
				//for example:
				sb.append('a').append('b').append('c');
				
				//If you want to print out a String you can directly call the StringBuilder object sb.
				System.out.println(sb);// prints:ButterFly123trueabc
				// Or you can call with 'toString' method! toString method helps to return items as String.
				System.out.println(sb.toString());// prints as ButterFly123trueabc
				//This is how we change the StringBuilder object to a String, if we don't use toString still it will be StringBuilder..
				//StringBuilder and String are 2 different types even though both of them are getting String!
				//This way how we get the content out of StringBuilder to String.|
				String content=sb.toString();
				//It will print everything we added with append method above.
				System.out.println(content);// prints same as: ButterFly123trueabc
				//Whatever you append to a StringBuilder it will print a String , don't forget!.
				//If we append an integer number to StringBuilder it will still print String!
				
				//Second way to create a StringBuilder constructor with initial value inside with String!
				StringBuilder sb1=new StringBuilder("Cybertek");
				//Since we leaned how to add item with append method, now we want delete the item with 'delete' method.
				// delete method has starting index and ending index to delete the item.
				//example
				sb1.delete(0, 2);// its deleting 'Cy' from the word Cybertek
				System.out.println(sb1);// prints: bertek, now we have only 5 index left in our word
				sb1.deleteCharAt(5);// its deleting only last index number location
				//if we give more number then our index number, it will give index outOfBound Exception
				System.out.println(sb1);// prints: berte, so we deleted 'k'
				// Now we are going to get the length of StringBuilder.
				// we use same method as String in StringBuilder too.
				int len=sb1.length();
				// Since we deleted some characters from String 'Cybertek', our length became 5.
				System.out.println(len);// so it prints: 5
				//We have 'set' method too in StrinBuilder, it will chop of the length of String.
				//for example
				sb1.setLength(3);// it chopped of te-->"berte"
				System.out.println(sb1);// it prints: ber
				//If I give more number then the String length with setLength method,-
				//it will still compile and prints "ber" and sets the rest lengths just EMPTY!
				sb1.setLength(17);
				System.out.println(sb1);//it will give same result and prints again: ber
				//Here we are forcing the length of String and it should print now 17
				System.out.println(sb1.length());// it prints: 17
				// If you add 4 more character it will add 4 to 17 and result will be for the length is 21.
				//for example
				sb1.append("Kivi");
				System.out.println(sb1.length());//it prints: 21
				// Here delete beginning index can not be out of range, ending index can!
				//In this method we care for beginning index and don't care about the ending index like as substring method.
				// 1 gets just first length and 50 gets the length part of the character that many you have and it will not be error.
				sb1.delete(1, 50);// the ending index is just exclusive.
				System.out.println(sb1);// it prints: b
				//StringBuilder has  'insert' method too!
				sb1.insert(1, "Jack");// I inserted Jack after my first character.
				System.out.println(sb1);// it will print: bJack
				sb1.append(" will hard! ");// added 'will hard!' to --> bJack
				System.out.println(sb1);// it prints:bJack will hard!
				sb1.insert(11, "study ");// inserted to 11 index the word 'study'
				System.out.println(sb1);// it prints: bJack will study hard!
				// Since its hard to count long index we can do easy in this way by using indexOf method.
				//for example
				int index= sb1.indexOf("hard!");// it will find statrting index of the word.
				sb1.insert(index, "study ");// I am seying insert study before hard!
				System.out.println(sb1);// prints bJack will study hard!
				// StringBuilder has 'replace method' too!
				//So far this is what we have in console "bJack will study study hard!
				//replace 'Bjack' with word 'Student'
				//sb1.replace(star, end, str)
				//for example
				sb1.replace(0, 5, "student").append("Then will be smart!");
				System.out.println(sb1);// it prints: student will study study hard! Then will be smart!
				// how to replace to the end of our String length.
//				System.out.println(sb1.replace(0, sb1.length(), "something"));// prints: something
				// student will study study hard! Then will be smart!
				int lastStudyIndex= sb1.lastIndexOf("study");
				System.out.println(lastStudyIndex);// our second word study staying in index 19.
				// StringBuilder has 'setCharAt' method too!
				sb1.setCharAt(0, 'S');// setting first index to uppercase letter S
				System.out.println(sb1);//it prints: Student
				//StringBuilder has 'reverse' method too!
				sb1.reverse();// it reverses all the String backward.
				System.out.println(sb1);// it prints: !trams eb lliw nehT !drah yduts yduts lliw tnedutS

			}	
				
			
				
}



