package HomeWork_1_2;

public class Main {
    public static void main(String[] args) {
        Triangle first = new Triangle(4,3,7);
        first.calculateTriangleArea();
        System.out.println(first);
        System.out.println();

        Triangle second = new Triangle();
        second.setA(12);
        second.setB(6);
        second.setC(-7);
        second.calculateTriangleArea();


    }
}
