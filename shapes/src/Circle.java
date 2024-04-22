import java.lang.Math;
public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        radius=0;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        return Math.PI*radius*2;
    }
}
