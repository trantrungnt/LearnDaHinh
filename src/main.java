import java.util.Vector;

/**
 * Created by TrungNT on 3/5/2016.
 */
public class main {
    public static void main(String[] args)
    {
        Vector<IArea> vector = new Vector<>();
        vector.add(new Circle(0, 0, 5));
        vector.add(new Rectangle(0, 0, 4, 5));
        vector.add(new Triangle(0, 0, 1, 1, 4, 1));
        vector.add(new Rectangle(1, 1, 2, 3));

        /*double sumDienTich=0;
        for(Shape hinh : vector){
            sumDienTich += hinh.dientich();
        }

        System.out.println("Tong cua cac hinh la: " + sumDienTich );*/

        //tinh tong dien tich cua hinh chu nhat
        double sum =0;
        for (IArea hinh: vector)
        {
            System.out.println(hinh.getClass().toString());
            if(hinh instanceof Rectangle){
                sum+=hinh.tinhDienTich();
            }
        }

        System.out.println(sum);

        //it dung cach nay
        /*if(hinh.getClass().toString().equals("class Reclangle")){
            sum += hinh.dientich();
        }*/

    }
}
