package HomeWork_2_1;

import java.util.Objects;

public class Circle extends Shape {
    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Circle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(a, circle.a) &&
                Objects.equals(b, circle.b);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + ((b == null) ? 0 : b.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double getArea() {
        double ab = a.distanceTo(b);
        return ab * ab * Math.PI;
    }

    @Override
    public double getPerimetr() {
        double ab = a.distanceTo(b);
        return 2 * ab * Math.PI;
    }
}

