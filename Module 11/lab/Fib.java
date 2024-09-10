// ******************************************************************
// Fib.java
//
// A utility class that provide methods to compute elements of the
// Fibonacci sequence.
// ******************************************************************
public class Fib {

    //--------------------------------------------------------------
// Recursively computes fib(n)
//--------------------------------------------------------------
    public static long fib1(long n) {
    // base case
        if (n == 1 || n == 2)
            return 1;
    // recurssive case
        else {
            return fib1(n-1) + fib1(n-2);
        }
    }
    public static long fib2(long n) {
        // Create an array of integers the size of the value passed in
        long[] fibArray = new long[(int) (n+1)];

        // Initialize the first two elements of the array to 0 and 1
        fibArray[0] = 0;
        if (n > 0) {
            fibArray[1] = 1;

            // Loop through the integers up to the value passed in
            for (int i = 2; i <= n; i++) {
                // Compute each element of the array as the sum of the two previous elements
                fibArray[i] = fibArray[i-1] + fibArray[i-2];
            }
         
        }    
        // Return the last element of the array
        return fibArray[(int) n];
    }
}