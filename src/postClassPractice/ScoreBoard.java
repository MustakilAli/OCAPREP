package postClassPractice;

public class ScoreBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] teams = {'A', 'B','C',};
		int teamA = 5;
		int teamB = 10;
		int teamC = 1;
		
		for (char team: teams) {
			int scores = 0;
			
			if (team == 'A') {
				scores = teamA;
				System.out.print("A ");
			} else if (team == 'B') {
				scores = teamB;
				System.out.print("B ");
			} else if (team == 'C') {
				scores = teamC;
				System.out.print("C ");
				
		}
			for (int star = 1; star <= scores; star++) {
				System.out.print("*");
			}
			
System.out.println();
	}

	} 
}
