public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(Double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return ((2 * 3.14 * getRadius() * height)) + (2 * 3.14 * (getRadius() * getRadius()));
    }

    public double volume() {
        return 3.14 * (getRadius() * getRadius()) * height;
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                "\nHeight: " + height +
                "\nRadius: " + getRadius() +
                "\nColor: " + getColor() +
                "\nFilled: " + getFilled() +
                "\nArea: " + area() +
                "\nVolume: " + volume();
    }

}
