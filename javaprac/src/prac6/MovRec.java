package prac6;

class MovRec implements Movable
{
    public int x;
    public int y;
    public int sx;
    public int sy;

    MovRec(int x,int y, int sx,int sy)
    {
        this.x=x;
        this.y=y;
        this.sx=sx;
        this.sy=sy;
    }
    @Override
    public void moveLeft()
    {
        System.out.println("Координата: ("+(x-sx)+";"+y+")");
    }
    @Override
    public void moveRight()
    {
        System.out.println("Координата: ("+(x+sx)+";"+y+")");
    }
    @Override
    public void moveUp()
    {
        System.out.println("Координата: ("+x+";"+(y+sy)+")");
    }
    @Override
    public void moveDown()
    {
        System.out.println("Координата: ("+x+";"+(y-sy)+")");
    }
}
