import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter the radius of the circle: ");
        double rad = input.nextDouble();
        if (rad >= 0) {
            double area = rad * rad * Math.PI;
            System.out.println("The area of the circle is " + area);
        }
        else {
            System.out.println("Please enter a positive value.");
        }
        input.close();

    }
}
