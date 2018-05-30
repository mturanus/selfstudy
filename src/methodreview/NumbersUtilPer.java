package methodreview;

import java.util.Random;

public class NumbersUtilPer {
	Random random=new Random();
	
	public void printInt() {
		
		System.out.println(random.nextInt());
		
	}
	public int getInt() {
		return random.nextInt();
		
	}

	
	public void printRandomInt(int upper) {
		if(upper<=0) {
			
			System.out.println("invalid argument");
			//return;
		}
		System.out.println(random.nextInt(upper));
	}
	
	public int getRandomInt(int upper) {
		
		if(upper <=0) {
			
			System.out.println("fatal error: invalid argument upper <=0");
			
		}
		return random.nextInt(upper);
	}
	
	public void printRandomIntRange(int lower, int upper) {
		
		if(lower>=upper) {
			System.out.println("invalid range lower>=upper");
		}
		int rNum=random.nextInt(upper);
		while(rNum<lower) {
			rNum=random.nextInt(upper);
			
		}
		System.out.println(rNum);
	}
	
	public boolean isPrime(int num) {
		if(num<=1) {
			return false;		
		}else if(num%2==0 && num!=2) {
		return false;
		}else {
			for(int n=2; n<num;n++) {
			if(num%n==0) {
				return false;
			}
		}
	}
	return true;
	
	}
	
	public int getMax(int num1, int num2, int num3) {
		if(num1>num2&&num1>num3) {
			return num1;
		}else if(num2>num3) {
			return num2;
		}
		return num3;
	}
	
	public int countPrimes(int upper) {
		
		int counter=0;
		for(int j=0; j<=upper;j++) {
			if(isPrime(j)) {
				
				counter++;
			}
		}
		return counter;
	}
	
	public int[] getPrimeNumbersRange(int upper) {
		
		int countP=countPrimes(upper);
		int [] primes=new int [countP];
		
		int index=0;
		for(int num=0; num<=upper; num++) {
			
			if(isPrime(num)) {
				primes[index]=num;
				index++;
			}
			
		}
		return primes;
	}
}
