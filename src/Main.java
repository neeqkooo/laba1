public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Circle circle = new Circle(12.0);
        System.out.println(circle.getSquare());
        System.out.println(circle.getPerimeter());
        Rectangle rectangle = new Rectangle(8.0, 2.0);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        Ellipsea ellipse = new Ellipsea(12.0, 12.0);
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse.getPerimeter());
    }
}