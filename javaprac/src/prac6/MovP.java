package prac6;

public class MovP implements Movable{
        private int xver, yver, xniz, yniz, syv, sxv, syn, sxn;
    MovP(int xver, int yver, int xniz, int yniz, int syv, int sxv, int syn, int sxn){ // syv/syn - speed y verx/niz;
        this.sxn = sxn;
        this.sxv = sxv;
        this.syv = syv;
        this.syn = syn;
        this.xniz = xniz;
        this.yniz = yniz;
        this.yver = yver;
        this.xver = xver;
    }

    @Override
    public void moveDown() {
        System.out.println("Координата: ("+xver+";"+(yver-syn)+") ("+xniz+";"+(yniz-syn)+")");
    }

    @Override
    public void moveLeft() {
        System.out.println("Координата: ("+(xver-sxv)+";"+yver+") ("+(xniz-sxn)+";"+yniz+")");
    }

    @Override
    public void moveRight() {
        System.out.println("Координата: ("+(xver+sxv)+";"+yver+") ("+(xniz+sxn)+";"+yniz+")");
    }

    @Override
    public void moveUp() {
        System.out.println("Координата: ("+xver+";"+(yver+syv)+") ("+xniz+";"+(yniz+syn )+")");
    }

    public void check()
    {
        if(sxn!=sxv && syv!=syn)
        {
            System.out.println("Ошибка!");
            System.exit(0);
        }
    }
}
