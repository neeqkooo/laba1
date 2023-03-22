public class Ellipsea implements Figure {
    private double a = 0.0;
    private double b = 0.0;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSquare() {
        return Math.PI * this.a * this.b;
    }

    public double getPerimeter() {
        return 4.0 * ((Math.PI * this.a * this.b + (this.a - this.b)) / (this.a + this.b));
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
