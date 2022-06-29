package Day10;

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
		if(n==1) {
			return true;
		}
		else if (n%2!=0 || n==0) {
			return false;
		}
		return powerTwo(n/2);
	}

	static void pyramid(int n, int i) {
		if (n == 0) {
            return;
        }
        for (int j = 0; j < n; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= (2 * i -1); j++) {
            System.out.print("* ");
        }
        System.out.print("\n");
        pyramid(n - 1, i + 1);
	}
	
	public static void pyramid(int n) {
		pyramid(n, 0);
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
		System.out.println(powerTwo(16));
		System.out.println(powerTwo(23));
		System.out.println(powerTwo(64));
		pyramid(5);
		
	}
}
