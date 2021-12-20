public class Wolf {
    private String sex;
    private String name;
    private float height;
    private float weight;
    private String color;
    private byte age;

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void say() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотится");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(byte age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
        this.age = age;
    }

    public byte getAge() {
        return age;
    }
}