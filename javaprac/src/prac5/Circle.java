package prac5;

public class Circle extends Shape {
    private float radius;

    Circle(float radius){
        this.radius = radius;
    }

    @Override
    float perimeter() {
        return (float) Math.PI * 2 * radius;
    }

    @Override
    float square() {
        return (float) Math.PI * radius * radius;
    }
}
