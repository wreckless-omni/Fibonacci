package main;

public class Fib {

	// #2 recursive Fibonacci sequence
	//numbers are swapped in a while loop until the cycle number is reached
	static long fibonacciRecur(int N)
    {
		long startTime = System.nanoTime();
        int num1 = 0, num2 = 1;
 
        int counter = 0;
 
        // Iterate till counter is N
        while (counter < N) {
 
            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
				long endTime = System.nanoTime();	
			return (endTime - startTime);
	
	}
	
	//#3 iterative Fibonacci sequence
	//for loop cycles through number swaps until the cycle number is reached
	 public static long fibonacciLoop(int nthNumber) {
	        
		 
		long  startTime = System.nanoTime();
			long finishtime;
	        int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

	        for (int i = 1; i < nthNumber ; i++) {

	            previouspreviousNumber = previousNumber;

	            previousNumber = currentNumber;

	            currentNumber = previouspreviousNumber + previousNumber;

	        }
	        finishtime = System.nanoTime();
	        return (finishtime -startTime);
	    }
	
	
	
}
