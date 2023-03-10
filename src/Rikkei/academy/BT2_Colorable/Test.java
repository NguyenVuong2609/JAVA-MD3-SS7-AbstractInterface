package Rikkei.academy.BT2_Colorable;


public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2,2);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            if ( shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
                System.out.println("Diện tích hình trên là: " + circle.getArea());
            }
            if ( shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle);
                System.out.println("Diện tích hình trên là: " + rectangle.getArea());
            }
            if ( shape instanceof Square) {
                IColorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
