package truutuong;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        ((Circle)shape).getArea();
            int xxx = (int) Math.round(Math.random() * 100);
            Circle circle=new Circle(3);
            circle.resize(xxx);
//        System.out.println(circle.getArea());
            System.out.println(circle);
        System.out.println(shape);
        Shape shape1=new Rectangle(3,5,"red",true);
        ((Rectangle)shape1).resize(xxx);
        System.out.println(shape1);
    }

}
