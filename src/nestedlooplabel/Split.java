package nestedlooplabel;

public class Split {
	
	/*
	 * If you have a sentence how do you find out how many 
	 * words you have in it?
	 * 
	 * 1) count number of spaces
	 * 		
	 */
	/*1) how many characters in sentence: 10
	  2) replace each space with empty -> " " -> ""
	  3) how many characters in sentence 7
	  4) do subtraction 10 - 7 -> 3+1
	*/
	

	public static void main(String[] args) {
		
		String sentence="find out how many";
		
		
//		System.out.println(sentence.length());
//		
//		String n=sentence.replace(" ", "");
//		
//		System.out.println(n.length());
//		
		
		String[] arrWords=sentence.split(" ");
		
		System.out.println("Number of words: " +arrWords.length);
		
		for(String word:arrWords) {
			
			System.out.println(word);
		}
		
		
		
		
		
		
		
	}

}
