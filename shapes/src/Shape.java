abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return "\n" + getClass().getSimpleName() + "\n" + String.format("Area: %.2f\nPerimeter %.2f", getArea(), getPerimeter());
    }
}
