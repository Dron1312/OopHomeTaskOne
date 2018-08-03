package HomeWork_2_1;



public class Main {
    public static void main(String[] args) {

    Point a = new Point(-3, 2);
    Point b = new Point(-1, 3);
    Point c = new Point(5, 2);
    Point d = new Point(2, -3);

    Triangle triangle = new Triangle(a, b, c);
    Quadrilateral quadrilateral = new Quadrilateral(a, b, c, d);
    Circle circle = new Circle(a, b);
    Circle circle1_1 = new Circle(c, d);


    Table table = new Table();

        System.out.println("Triangle");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimetr: " + triangle.getPerimetr());
        System.out.println();

        System.out.println("Quadrilateral");
        System.out.println("Area: " + quadrilateral.getArea());
        System.out.println("Perimetr: " + quadrilateral.getPerimetr());
        System.out.println();

        System.out.println("Circle");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Length: " + circle.getPerimetr());
        System.out.println();

        System.out.println("Circle_1");
        System.out.println("Area: " + circle1_1.getArea());
        System.out.println("Length: " +circle1_1.getPerimetr());
        System.out.println();

        System.out.println("On Table");
        table.addShape(triangle);
        table.addShape(circle);
        table.addShape(quadrilateral);
        table.addShape(circle1_1);

        table.print();
        System.out.println();

        System.out.println("All areas: " + table.allAreas());
        System.out.println();

        System.out.println("Remove any shape from table");
        table.removeShape(2);
        table.print();

        System.out.println(circle1_1.hashCode());
        System.out.println(circle.hashCode());

        System.out.println(circle.equals(circle1_1));


    }
}

