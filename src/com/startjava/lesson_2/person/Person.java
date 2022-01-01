package src.com.startjava.lesson_2.person;

public class Person {
    String sex = "Man";
    String name = "Andrei";
    float height = 2.05f;
    float weight = 110.1f;
    int age = 29;

    void walk() {
        System.out.println("Идет");
    }

    boolean sit() {
        return true;
    }

    void run() {
        System.out.println("Бежит");
    }

    String say() {
        return "Say";
    }

    void learn() {
        System.out.println("Java");
    }
}
