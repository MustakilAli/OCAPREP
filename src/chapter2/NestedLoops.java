package chapter2;

public class NestedLoops {

	public static void main(String[] args) {
		int [][] myComplexArray = {{5,2,1,4},{3,9,8,9},{5,7,12,7}}; // Multi-Dimensional Array - Arrays within an Array
		for (int[] mySimpleArray : myComplexArray) { //int [] mySimpleArray turned into {},{},{} individual arrays - - length starts from 1, index starts from 0 
//			for(int eachElement: mySimpleArray) {
//				 System.out.print(eachElement + "\t");
//			}
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
		
	}

}




