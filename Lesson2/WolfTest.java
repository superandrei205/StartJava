public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.color = "grey";
        wolf.height = 1.0f;
        wolf.name = "Wolf";
        wolf.sex = "male";
        wolf.weight = 90.01f;

        System.out.println("Цвет волка : " + wolf.color);
        System.out.println("Рост волка : " + wolf.height);
        System.out.println("Имя волка : " + wolf.name);
        System.out.println("Пол волка : " + wolf.sex);
        System.out.println("Вес волка : " + wolf.weight);

        wolf.hunt();
        wolf.run();
        wolf.say();
        wolf.sit();
        wolf.walk();
    }
}
