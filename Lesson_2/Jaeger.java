public class Jaeger {
    
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strenght;
    private int armor;

    public String getModelName() {
        return modelName;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getArmor() {
        return armor;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    String scanKaiju() {
        return "nothing";
    }

    void useVortexCannon() {
        System.out.println("Вы произвели выстрел");
    }

    public Jaeger(String a, String b, String c, float d, float e, int f, int g, int h) {
        modelName = a;
        mark = b;
        origin = c;
        height = d;
        weight = e;
        speed = f;
        strenght = g;
        armor = h;
    }
}