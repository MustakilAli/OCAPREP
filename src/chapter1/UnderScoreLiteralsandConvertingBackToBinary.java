package chapter1;

public class UnderScoreLiteralsandConvertingBackToBinary {

	public static void main(String[] args) {
			double annoyingButLegal = 1_00_0.0_0;
			System.out.println(annoyingButLegal);
			System.out.println(56);
			System.out.println(0b11); //right 1 + left 1 = Base 2 -- 2 x left 1 = 2. 2 + right 1 = Result = 3
			System.out.println(017); //right 7 + left 1 = Base 8 -- 8 x left 1 = 8. 8 + right 7 = Result = 15
			System.out.println(0x1F); //F = 15 + left 1 = Base 16 -- 16 x 1 = 16. 16 + right 15 = Result = 31
			
			
			//Hexadecimals convert = Digits = 0-9 then A-F ...A = 10, B = 11, C = 12, D = 13, E = 14, F = 15. 


		}

	}

