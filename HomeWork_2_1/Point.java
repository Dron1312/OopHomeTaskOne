package HomeWork_2_1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point(){
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        final double prime = 31;
        double result = 1;
        result = prime * result + x;
        result = prime * result + y;

        return (int) result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distanceTo(Point that) {
        double dx = this.x - that.x;
        double dy = this.y - that.y;

        return Math.sqrt(dx*dx + dy*dy);
    }


}
