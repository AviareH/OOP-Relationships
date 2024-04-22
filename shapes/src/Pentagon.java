import java.lang.Math;
public class Pentagon extends Shape{
    public double sideLength;
    public Pentagon(double sideLength){
        this.sideLength = sideLength;
    }
    public Pentagon(){
        sideLength=0;
    }

    public void setLength(double sideLength){
        this.sideLength=sideLength;
    }
    public double getLength(){
        return sideLength;
    }

    public double getArea(){
        return 0.25*Math.sqrt(5.0*(5.0+2.0*Math.sqrt(5))) * Math.pow(sideLength,2);
    }
    public double getPerimeter() {
        return 5*sideLength;
    }
}
