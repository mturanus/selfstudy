package nestedlooplabel;

public class CoinJar {
	
	public static void main(String[] args) {
		
		
		int[] coinsJar = { 10, 10, 25, 5, 5, 25, 10 };
		
		int quarter,dimes,nickel;
		
		quarter=dimes=nickel=0;
		
		for(int coin: coinsJar) {
			
			switch(coin) {
			
			case 25:
				
				quarter++;
				break;
			case 10:
				
				dimes++;
				break;
				
			case 5:
				
				nickel++;
				break;
				
				default:
					
					System.out.println("not the Quarter, dimes, or nickels. ");
			}
		}
		
		System.out.println("You have "+ quarter +" quarters -> "+ (quarter*25) +" cents");
		System.out.println("You have "+ dimes+" dimes -> "+ (dimes*10) +" cents");
		System.out.println("You have "+ nickel+" nickel -> "+ (nickel*5) +" cents");
		
	}

}
