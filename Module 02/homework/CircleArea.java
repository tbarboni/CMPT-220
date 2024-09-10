import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Ask the user for input
        System.out.println("Value for radius");
        double radius = input.nextDouble();
        // Calculate the area
        double area = radius * radius * 3.14159;
        System.out.println("The area is" + area);
    }
}
