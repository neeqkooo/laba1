public class Circle implements fgre {
    private double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 12.0);
    }

    public double getPerimeter() {
        return 6.283185307179586 * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}