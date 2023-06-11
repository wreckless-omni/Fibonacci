package main;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//#1 call and print different values from fibonacci methods
		
		System.out.println("Recursive 100" + Fib.fibonacciRecur(100));
		System.out.println("Iterative 100" + Fib.fibonacciLoop(100));
		System.out.println();

		System.out.println("Recursive 1000" + Fib.fibonacciRecur(1000));
		System.out.println("Iterative 1000" + Fib.fibonacciLoop(1000));
		System.out.println();
		
		System.out.println("Recursive 10000" + Fib.fibonacciRecur(10000));
		System.out.println("Iterative 10000" + Fib.fibonacciLoop(10000));
		System.out.println();
		
		System.out.println("Recursive 1000000" + Fib.fibonacciRecur(1000000));
		System.out.println("Iterative 1000000" + Fib.fibonacciLoop(1000000));
		System.out.println();
		
		System.out.println("Recursive 100000000" + Fib.fibonacciRecur(100000000));
		System.out.println("Iterative 100000000" + Fib.fibonacciLoop(100000000));
		
	}

}
