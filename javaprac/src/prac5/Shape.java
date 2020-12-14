package prac5;

public abstract class Shape {
    abstract float perimeter();
    abstract float square();
}

class kek{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println( circle.perimeter());
        System.out.println( circle.square());

        Square square = new Square(3);
        System.out.println( square.perimeter());
        System.out.println( square.square());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);rectangle.getHeight();rectangle.setWidth(1);rectangle.getWidth();
        System.out.println( rectangle.perimeter());
        System.out.println( rectangle.square());
    }
}
