package HomeWork_1_3;

public class Main {
    public static void main(String[] args) {
        Vector3d one = new Vector3d(4,4,8);
        Vector3d two = new Vector3d(7,8,2);

        Vector3d three = Vector3d.sumOfVectors(one, two);
        System.out.println(three);
        System.out.println();

        double d = Vector3d.scalarMultiplication(one, two);
        System.out.println(d);
        System.out.println();

        Vector3d four = Vector3d.vectorMultiplication(one, two);
        System.out.println(four);


    }
}
