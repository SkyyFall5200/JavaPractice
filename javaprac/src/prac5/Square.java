package prac5;

public class Square extends Shape {
    private int side;

    Square(int side){
        this.side = side;
    }

    @Override
    float perimeter() {
        return (float) 4*side;
    }

    @Override
    float square() {
        return (float) side*side;
    }
}
