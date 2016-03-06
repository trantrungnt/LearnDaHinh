# Học về tính đa hình trong ngôn ngữ Java
+ Định nghĩa Class Cha: Shape và dùng abstract để chỉ những Class: Circle, Rectangle, Triangle kế thừa mới được sử dụng các thuộc tính của Class Cha Shape
+ Từ khóa Super: khi khai báo trong phương thức khởi tạo của các class con: Circle, Rectangle, Triangle thì ta gọi được phương thức khởi tạo của Class cha Shape
+ Phương thức abstract khi khai báo trước 1 phương thức trong class cha là: Shape:. tại các Class con, trong phương thức của class con, ta phải định nghĩa lại

#Học về Interface trong ngôn ngữ Java
+ Ta định nghĩa thêm Interface IArea (area nghĩa là diện tích) và có phương thức: Hàm tính diện tích iArea
+ Class Shape Cha Implement Interface IArea
+ Class Circle implement interface IArea và định nghĩa lại hàm tinhDienTich() cho hình Circle
```
 @Override
    public double tinhDienTich() {
        return radius*radius*Math.PI;
    }
```
và Circle phải implement interface IArea như sau
```
public class Circle extends Shape implements IArea{
}
```

+ Trong hàm static void main ta gọi ra như sau
```
public static void main(String[] args) {
        Vector<IArea> vector = new Vector<>();
        vector.add(new Triangle(0, 0, 4, 4, 1, 1));
        vector.add(new Rectangle(0, 0, 4, 5));
        vector.add(new Circle(0, 0, 5));
        vector.add(new Rectangle(1, 1, 2, 3));

        double area = 0;
        for (IArea hinh : vector) {
            //System.out.println(shape.getClass().toString());
            if (hinh instanceof Rectangle) {
                area += tinhDienTich();
            }

            //if (shape.getClass().toString().equals("class Rectangle")) {
              //  area += shape.iArea();
            //}  shape.getClass().toString() == "class Rectangle"
        }
        System.out.println(area);
    }
```


##Chú ý
```
//it dung cach nay: hinh.getClass().toString() == "class Rectangle" ==> khong so sanh duoc ma phai dung equal
        if(hinh.getClass().toString().equals("class Rectangle")){ //so sanh duoc
            sum += hinh.dientich();
        }
```

+ Trong phương thức static void main của Class main (phải viết là Main để đúng cách đặt tên class) thì ta có thể dùng instanceof  là class ta muốn để dùng: ở đây, ta khởi tạo các hình Circle, 2 hình Rectangle, Triangle. Và ta chỉ muốn tính tổng diện tích của 2 hình Rectangle
```
Vector<Shape> vector = new Vector<>();
        vector.add(new Circle(0, 0, 5));
        vector.add(new Rectangle(0, 0, 4, 5));
        vector.add(new Triangle(0, 0, 1, 1, 4, 3));
        vector.add(new Rectangle(1, 1, 2, 3));
double sum =0;
        for (Shape hinh: vector)
        {
            System.out.println(hinh.getClass().toString());
            if(hinh instanceof Rectangle){
                sum+=hinh.dientich();
            }
        }
```