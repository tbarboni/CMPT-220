public class Cylinder extends Shape3D {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        return ((2 * 3.14 * radius * height)) + (2 * 3.14 * (radius * radius));
    }

    @Override
    public double getVolume() {
        return 3.14 * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return "Cylinder: " +
                "\nHeight: " + height +
                "\nRadius: " + radius +
                "\nArea: " + getSurfaceArea() +
                "\nVolume: " + getVolume();
    }

}
