public class Rectangle implements Figure {
    private double a = 0.0;
    private double b = 0.0;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return this.a * this.b;
    }

    public double getPerimeter() {
        return (this.a + this.b) * 2.0;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }
}