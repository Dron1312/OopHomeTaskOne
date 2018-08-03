package HomeWork_2_1;

import java.util.Objects;

public class Quadrilateral extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Quadrilateral(){
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadrilateral that = (Quadrilateral) o;
        return Objects.equals(a, that.a) &&
                Objects.equals(b, that.b) &&
                Objects.equals(c, that.c) &&
                Objects.equals(d, that.d);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + ((b == null) ? 0 : b.hashCode());
        result = prime * result + ((c == null) ? 0 : c.hashCode());
        result = prime * result + ((d == null) ? 0 : d.hashCode());
        return result;
    }

    public double getArea() {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double cd = c.distanceTo(d);
        double da = d.distanceTo(a);
        double p = (ab + bc + cd + da) / 2;

        return Math.sqrt((p - ab) * (p - bc) * (p - cd) * (p - da));
    }

    public double getPerimetr() {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double cd = c.distanceTo(d);
        double da = d.distanceTo(a);

        return (ab + bc + cd + da);

    }

}


