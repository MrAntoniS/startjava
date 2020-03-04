public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();

        jaegerOne.setModelName("Gipsy Danger");
        System.out.println(jaegerOne.getModelName());

        jaegerOne.setMark("Mark-3");
        System.out.println(jaegerOne.getMark());

        jaegerOne.setOrigin("USA");
        System.out.println(jaegerOne.getOrigin());

        jaegerOne.setHeight(79.25f);
        System.out.println(jaegerOne.getHeight());

        jaegerOne.setWeight(1.98f);
        System.out.println(jaegerOne.getWeight());

        jaegerOne.setSpeed(7);
        System.out.println(jaegerOne.getSpeed());

        jaegerOne.setStrenght(8);
        System.out.println(jaegerOne.getStrenght());

        jaegerOne.setArmor(6);
        System.out.println(jaegerOne.getArmor());

        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();


        Jaeger jaegerTwo = new Jaeger();
        System.out.println("");

        jaegerTwo.setModelName("Crimson Typhoon");
        System.out.println(jaegerTwo.getModelName());

        jaegerTwo.setMark("Mark-4");
        System.out.println(jaegerTwo.getMark());

        jaegerTwo.setOrigin("China");
        System.out.println(jaegerTwo.getOrigin());

        jaegerTwo.setHeight(76.2f);
        System.out.println(jaegerTwo.getHeight());

        jaegerTwo.setWeight(1.722f);
        System.out.println(jaegerTwo.getWeight());

        jaegerTwo.setSpeed(9);
        System.out.println(jaegerTwo.getSpeed());

        jaegerTwo.setStrenght(8);
        System.out.println(jaegerTwo.getStrenght());

        jaegerTwo.setArmor(6);
        System.out.println(jaegerTwo.getArmor());

        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
    }
}