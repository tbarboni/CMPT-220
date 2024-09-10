public class Cube extends Square {
    public Cube() {
    }

    public Cube(double width, String color, boolean filled) {
        super(width, color, filled);
    }

    public double area() {
        return 6 * (getWidth() * getWidth());
    }

    public double volume() {
        return getWidth() * getWidth() * getWidth();
    }

    @Override
    public String toString() {
        return "Cube: " +
                "\nWidth: " + getWidth() +
                "\nColor: " + getColor() +
                "\nFilled: " + getFilled() +
                "\nArea: " + area() +
                "\nVolume: " + volume();
    }
}
