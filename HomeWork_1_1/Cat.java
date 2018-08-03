package HomeWork_1_1;

public class Cat {
    private String name;
    private int age;
    private String color;
    private double weight;
    private boolean sex; // m - true, f - false
    private String type;

    public Cat(String name, int age, String color, double weight, boolean sex, String type) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.sex = sex;
        this.type = type;
    }

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", sex=" + sex +
                ", type='" + type + '\'' +
                '}';
    }

    public void getVoice(){
        System.out.println("муррррррррр");
    }

    public void wantEat(){
        System.out.println("РРРРРРРРРР!!!!!");
    }

    public boolean isAsleep (boolean Zz){
        //////////
        return Zz;

    }
}
