package prac6;

public abstract class Rectangle
{
    public int width;
    public int height;

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

    public int P=(width+height)*2;
    public int S=width*height;

    public void PerAndSqu()
    {
        System.out.println("Периметр прямоугольника P=" + P);
        System.out.println("Площадь прямоугольника S=" + S);
    }

    public static void main(String[] args)
    {
        MovRec rectangle=new MovRec(1,2,3,4);
        rectangle.moveDown();
        MovP rectangle1 =new MovP(1,2,3,4,5,6,5,6);
        rectangle1.check();
        rectangle1.moveRight();
        MovP rectangle2=new MovP(1,1,3,4,5,6,0,1);
        rectangle2.check();
        rectangle2.moveUp();
    }
}
