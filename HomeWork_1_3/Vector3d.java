package HomeWork_1_3;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public final static Vector3d sumOfVectors(Vector3d a, Vector3d b){

        return new Vector3d(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
    }

    public final static double scalarMultiplication(Vector3d a, Vector3d b){

        return (a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ());
    }

    public final static Vector3d vectorMultiplication(Vector3d a, Vector3d b){
        return new Vector3d(a.getY() * b.getZ() - a.getZ() * b.getY(),
                                 a.getZ() * b.getX() - a.getX() * b.getZ(),
                                      a.getX() * b.getY() - a.getY() * b.getX());
    }
}
