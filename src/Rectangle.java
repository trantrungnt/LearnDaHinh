/**
 * Created by TrungNT on 3/5/2016.
 */
public class Rectangle extends Shape implements IArea{
    private int with;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    private int height;

    public Rectangle() {
        super();
        this.with =0;
        this.height =0;
    }

    public Rectangle(int x, int y, int with, int height) {
        super(x, y);
        this.with = with;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }


    @Override
    public double tinhDienTich() {
        return this.with*this.height;
    }
}
