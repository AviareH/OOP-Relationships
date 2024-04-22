public class Main {
    public static void main(String[] args) {
        Circle mycircle = new Circle(5);
        Hexagon myhexagon = new Hexagon(5);
        Parallelogram myparallelogram = new Parallelogram(5,5,5);
        Pentagon mypentagon = new Pentagon(5);
        Rectangle myrectangle = new Rectangle(5,5);
        Triangle mytriangle = new Triangle(5,5,5);
        Square mysquare = new Square(5);

        System.out.println(mycircle);
        System.out.println(myhexagon);
        System.out.println(myparallelogram);
        System.out.println(mypentagon);
        System.out.println(myrectangle);
        System.out.println(mytriangle);
        System.out.println(mysquare);
    }
}