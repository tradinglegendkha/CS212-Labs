package Day10;
import java.text.ParsePosition;

public class Recursion {
	static void countdown(int n) {
		 System.out.println(n);
		 if (n != 0)
			 countdown(n - 1);
	}
	 
	static void countup(int n) {
		if (n != 0)
			countup(n - 1);
		System.out.println(n);
	}

	//number 2 power of two
	static boolean powerTwo(int n) {
		while(n!=0) {
			n /= 2;
			if(Math.sqrt(n)==n) {
				return true;
			}	
		}	
		return false;
	}

	static void pyramid(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static int summation(int n) {
		if (n == 1)
			return 1;
		return n + summation(n-1);
	}
	
	static int factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n-1);
	}
	
	static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n -2);
	}
	public static void main(String [] args) {
		//System.out.println(fibonacci(46));
		System.out.println(powerTwo(23));
		System.out.println(powerTwo(64));
		System.out.println(powerTwo(25));
		pyramid(5);
		
	}
}
