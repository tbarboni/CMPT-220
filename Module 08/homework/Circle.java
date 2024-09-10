public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }

    public double circumfrence() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle:\n" +
                "\nRadius: " + radius +
                "\nColor: " + getColor() +
                "\nFilled: " + getFilled() +
                "\nArea: " + area() +
                "\nCircumference: " + circumfrence();
    }

}
