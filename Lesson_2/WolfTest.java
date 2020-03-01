public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.name = "Bob";
        System.out.println(wolfOne.name);

        wolfOne.sex = "male";
        System.out.println(wolfOne.sex);

        wolfOne.age = 5;
        System.out.println(wolfOne.age);

        wolfOne.weight = 30;
        System.out.println(wolfOne.weight);

        wolfOne.color = "grey";
        System.out.println(wolfOne.color);

        wolfOne.move();

        wolfOne.sit();

        wolfOne.run();

        wolfOne.howl();

        wolfOne.hunt();
        
    }
}