import java.lang.Math;
public class Hexagon extends Pentagon{
    public Hexagon(double sideLength){
        super(sideLength);
    }
    public Hexagon(){
        super(0);
    }
    public void setSideLength(double sideLength){
        super.setLength((sideLength));
    }
    public double getSideLength(){
        return super.getLength();
    }

    public double getArea() {
        return ((3.0*Math.sqrt(3))/2.0)*Math.pow(super.sideLength,2);
    }
    public double getPerimeter() {
        return 6*super.sideLength;
    }
}
