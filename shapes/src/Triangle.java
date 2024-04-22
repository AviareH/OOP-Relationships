import java.lang.Math;
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public Triangle(){
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }
    public void setSideA(double side){
        this.sideA = side;
    }
    public void setSideB(double side){
        this.sideB = side;
    }
    public void setSideC(double side){
        this.sideC = side;
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    public double getArea(){
        double semiPerimeter = (sideA+sideB+sideC)/2.0;
        return Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
    }

    public double getPerimeter(){
        return sideA+sideB+sideC;
    }
}
