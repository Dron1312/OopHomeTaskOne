package HomeWork_2_1;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private List<Shape> table = new ArrayList<Shape>();

    public Table() {
        super();
    }

    public List<Shape> getTable() {
        return table;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table=" + table +
                '}';
    }

    public void addShape(Shape shape)throws IndexOutOfBoundsException{
        if (table.size() >= 4) {
            throw new IndexOutOfBoundsException("The number of figures should not exceed four");
        }else {
            table.add(shape);
        }
    }

    public void removeShape(int i) throws IllegalArgumentException{
        if(i < 0){
            throw new IllegalArgumentException("Argument cannot be negative");
        }else {
            table.remove(i);
        }
    }

    public void print(){
        for (Shape i : table) {
            System.out.println(i);
        }
    }

    public double allAreas(){

        return table.get(0).getArea() + table.get(1).getArea() + table.get(2).getArea() + table.get(3).getArea() ;
    }

}
