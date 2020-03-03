public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setName("Bob");
        System.out.println(wolfOne.getName());

        wolfOne.setSex("male");
        System.out.println(wolfOne.getSex());

        wolfOne.setAge(9);
        System.out.println(wolfOne.getAge());

        wolfOne.setWeight(30);
        System.out.println(wolfOne.getWeight());

        wolfOne.setColor("grey");
        System.out.println(wolfOne.getColor());

        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}