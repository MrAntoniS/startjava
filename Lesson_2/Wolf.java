public class Wolf {
    
    private String name;
    private String sex;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.print("Некорректный возраст ");
            this.age = age;
        } else {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void move() {

    }

    public void sit() {

    }

    public void run() {

    }

    public void howl() {

    }

    public void hunt() {

    }
}