package HomeWork_1_1;

public class Main {
    public static void main(String[] args) {
        Cat jora = new Cat("Jora",2, "black", 2.8, true, "Persian");

        System.out.println(jora);
        jora.wantEat();
        System.out.println();

        Cat fifi = new Cat();

        fifi.setName("Fifi");
        fifi.setAge(1);
        fifi.setColor("ginger");
        fifi.setWeight(5.2);
        fifi.setSex(false);
        fifi.setType("Street cat");

        System.out.println(fifi);
        fifi.getVoice();
    }
}
