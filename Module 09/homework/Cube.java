public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getSurfaceArea() {
        return 6 * (side * side);
    }

    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube: " +
                "\nWidth: " + side +
                "\nArea: " + getSurfaceArea() +
                "\nVolume: " + getVolume();
    }
}
