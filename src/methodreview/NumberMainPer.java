package methodreview;

import java.util.Arrays;

public class NumberMainPer {
	
	public static void main(String[] args) {
		NumbersUtilPer numUtil=new NumbersUtilPer();
		numUtil.printInt();
		numUtil.printInt();
		
		numUtil.printRandomInt(100);
		
		numUtil.getRandomInt(30);
		
		numUtil.printRandomIntRange(50, 60);
		
		int i=numUtil.getInt();
		
		System.out.println(i);
		
		System.out.println(numUtil.getInt()+1000);
		
		if(numUtil.getInt()>0) {
			System.out.println("it is a positive int");
		}else {
			System.out.println("negative int");
		}
		System.out.println("==========================\n");
		
		switch(numUtil.getRandomInt(5)) {
			case 0:
			System.out.println("zero");
			break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			default:
				break;
			}
		
		System.out.println("======PRIME==========");
		
		System.out.println(numUtil.isPrime(53));
		
		boolean pr=numUtil.isPrime(numUtil.getRandomInt(100));
		System.out.println(pr);
		
		pr=numUtil.isPrime(numUtil.getRandomInt(numUtil.getRandomInt(100)));
		System.out.println(pr);
		
		System.out.println("========LARGEST===========");
		
		
		int l=numUtil.getMax(10, 32, 231);
		System.out.println(l);
		
		l=numUtil.getMax(4, 4, 1);
		
		System.out.println(l);
		
		l=numUtil.getMax(5, 5, 5);
		
		System.out.println(l);
		
		System.out.println("============PRIME RANGE=========");
		
		int pCount=numUtil.countPrimes(155);
		
		System.out.println(pCount);
		
		System.out.println("========PRIME RANGE INTO ARRAY METHOD========");
		
		int [] primeNumbers=numUtil.getPrimeNumbersRange(15);
		
		System.out.println(Arrays.toString(primeNumbers));
		
		for(int prime:primeNumbers) {
			System.out.println(prime+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
