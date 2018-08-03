package HomeWork_1_2;

public class Triangle {
    private double a;
    private double b;
    private double c;
    private double p;
    private double area;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", area=" + area +
                '}';
    }

    public double calculateTriangleArea()throws ArithmeticException {

        if (a > 0 && b > 0 && c > 0) {

            p = a + b + c;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return area;

        } else
            throw new ArithmeticException("!!!!!!one side of the triangle is less than or equal to zero!!!!!!");
    }
}
