package nestedlooplabel;

public class SearchResult {

	public static void main(String[] args) {

		String searchResult = "About 13,500,000 results (0.57 seconds)";

		// String [] result=searchResult.split(" ");
		//
		// System.out.println(result.length);
		//
		// for(String sprt:result) {
		//
		// System.out.println(sprt);
		// }
		//
		// System.out.println(result[3].replace("(", ""));
		//

		String[] result = searchResult.split("results");

		System.out.println(result[1]);

		for (String sprt : result) {

			System.out.println(sprt);

		}

		String tests = "date;year;type;category;";

		String[] testWord = tests.split(";");

		System.out.println("Number of words " + testWord.length);

		for (String n : testWord) {

			System.out.println(n);
		}

	}
}
