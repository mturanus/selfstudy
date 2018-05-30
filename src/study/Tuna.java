package study;

public class Tuna {
	
	private String first;
	private String last;
	private static int members =0;
	
	
	public Tuna (String fn, String ln) {
		first =fn;
		last=ln;
		members++;
		System.out.println("Construsctor for "+fn+" "+last+ ", members in the club: "+members);
	}
	
	


}
