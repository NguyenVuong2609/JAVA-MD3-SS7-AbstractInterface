package Rikkei.academy.BT1_Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                IResizeable resizeable = (Circle) shape;
                resizeable.resize((int) (Math.random() * 100));
            }
            if (shape instanceof Rectangle) {
                IResizeable resizeable = (Rectangle) shape;
                resizeable.resize((int) (Math.random() * 100));
            }
        }
        System.out.println("Sau khi resize");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
