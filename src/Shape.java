/**
 * Created by TrungNT on 3/5/2016.
 */
public abstract class Shape implements IArea{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    public Shape()
    {
        x=0;
        y=0;
    }

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }


    //phuong thuc ao cua class cha Shape
    public abstract void draw();
    /*public void draw()
    {
        System.out.println("Shape");
    }*/

    void move()
    {

    }
}
