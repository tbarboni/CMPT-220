public class Square extends Shape {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return width * width;
    }

    public double perimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "Square:" +
                "\nWidth: " + width +
                "\nColor: " + getColor() +
                "\nFilled: " + getFilled() +
                "\nArea: " + area() +
                "\nPerimeter: " + perimeter();
    }

}
