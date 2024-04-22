public class Parallelogram extends Rectangle{
    private double height;

    public Parallelogram(double length, double width, double height){
        super(length,width);
        this.height=height;
    }
    public Parallelogram(){
        super(0,0);
        height=0;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    public double getArea() {
        return super.getLength()*height;
    }
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
