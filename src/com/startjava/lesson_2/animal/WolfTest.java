package src.com.startjava.lesson_2.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setColor("grey");
        wolf.setHeight(1.0f);
        wolf.setName("Wolf");
        wolf.setSex("male");
        wolf.setWeight(90.01f);
        wolf.setAge((byte) 10);
        wolf.setAge((byte) 3);

        System.out.println("Цвет волка : " + wolf.getColor());
        System.out.println("Рост волка : " + wolf.getHeight());
        System.out.println("Имя волка : " + wolf.getName());
        System.out.println("Пол волка : " + wolf.getSex());
        System.out.println("Вес волка : " + wolf.getWeight());
        System.out.println("Возвраст волка : " + wolf.getAge());

        wolf.hunt();
        wolf.run();
        wolf.say();
        wolf.sit();
        wolf.walk();
    }
}
