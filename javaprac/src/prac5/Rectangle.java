package prac5;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    float perimeter() {
        return (float) 2*width + 2*height   ;
    }

    @Override
    float square() {
        return width*height;
    }
}
