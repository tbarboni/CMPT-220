import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the lists: ");
        int size = input.nextInt();
        int[] list1 = new int[size]; // Array Declaration
        int[] list2 = new int[size];
        for (int i = 0; i < list1.length; i++) {
            System.out.print("Enter an integer for list 1: ");
            list1[i] = input.nextInt();
        }
        System.out.println(" ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print("Enter an integer for list 2: ");
            list2[i] = input.nextInt();
        }
        System.out.print(" ");
        int product = 0;
        for (int i = 0; i < list1.length; i++) {
            product += (list1[i] * list2[i]);
        }
        System.out.print(product);
        input.close();
    }
}
