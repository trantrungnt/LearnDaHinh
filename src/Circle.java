/**
 * Created by TrungNT on 3/5/2016.
 */
public class Circle extends Shape {
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public Circle()
    {
        //super tham chieu thang cha
        super(); //goi ham khoi tao tham so cua Shape
        radius =0;
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public double dientich() {

        return radius*radius*Math.PI;
    }

    public Circle(int x, int y, int radis)
    {
        super(x,y);
        this.radius = radis;
    }


}
