public class Square extends Rectangle{
    public Square(double side){
        super(side,side);
    }
    public  Square(){
        super(0,0);
    }
    public double getSideLength(){
        return super.getLength();
    }
    public void setSideLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
