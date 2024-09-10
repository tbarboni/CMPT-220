public class Circle extends Shape2D {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle:\n" +
                "\nRadius: " + radius +
                "\nArea: " + getArea() +
                "\nCircumference: " + getPerimeter();
    }

}
