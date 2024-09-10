public class Step10 {
    public static void main(String[] args) {
        // Loop 1 sums up all of the values from 1 to 10, outputting the sum as you go.

        // Set values for loop 1
        int sum = 0;

        // Execute Loop 1
        System.out.println("Loop One:");
        for (int i = 1; i <= 10; i++) {
           
            sum = sum + i;
            System.out.println(sum);

        }

        // Loop 2 sums up all of the values starting at 1 and going until the sum is
        // greater than 100

        // Set Values for loop 2
        int summation = 0;
        int value = 1;

        // Execute loop 2
        System.out.println("Loop Two:");
        while (summation <= 100) {
            if (summation + value > 100) {
                break;
            }
            summation += value;
            value++;
            System.out.println(summation);
        }
    }
}
