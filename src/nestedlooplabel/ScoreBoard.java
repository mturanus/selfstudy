package nestedlooplabel;

public class ScoreBoard {

	public static void main(String[] args) {

		char[] teams = { 'A', 'B', 'C' };

		int teamA = 10;
		int teamB = 7;
		int teamC = 4;

		for (char team : teams) {

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

			for (int i = 1; i <= scores; i++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
