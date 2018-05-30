package nestedlooplabel;

public class ReplaceB {
	
	public static void main(String[] args) {
		
		String[] words= {"Bananas","Bluberries","Cherries","Broccoli","Butternut Squash"};
		
		for(int i =0; i<words.length;i++) {
			
			words[i]=words[i].replace('b', 'v');
			words[i]=words[i].replace('B', 'V');
			
		}
		
		for(String n: words) {
			
			System.out.println(n+" ");
			
		}
	}

}
