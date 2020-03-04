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

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    void setArmor(int armor) {
        this.armor = armor;
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
}