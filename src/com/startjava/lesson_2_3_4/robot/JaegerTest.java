package src.com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger();
        jaeger1.setModelName("jaeger1");
        jaeger1.setMark("MarkJaeger1");
        jaeger1.setOrigin("OriginJaeger1");
        jaeger1.setStreight(9);
        jaeger1.setCategory("CategoryJaeger1");
        jaeger1.setClassification("ClassificationJaeger1");
        jaeger1.setArmour(8);
        jaeger1.setHeight(99);
        jaeger1.setWeight(99);

        jaeger2.setModelName("jaeger2");
        jaeger2.setMark("MarkJaeger2");
        jaeger2.setOrigin("OriginJaeger2");
        jaeger2.setStreight(17);
        jaeger2.setCategory("CategoryJaeger2");
        jaeger2.setClassification("ClassificationJaeger2");
        jaeger2.setArmour(1);
        jaeger2.setHeight(22);
        jaeger2.setWeight(22);

        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getOrigin());
        System.out.println(jaeger1.getStreight());
        System.out.println(jaeger1.getCategory());
        System.out.println(jaeger1.getClassification());
        System.out.println(jaeger1.getArmour());
        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger1.getWeight());

        jaeger1.setModelName("jaeger2");
        jaeger1.setMark("MarkJaeger2");
        jaeger1.setOrigin("OriginJaeger2");
        jaeger1.setStreight(17);
        jaeger1.setCategory("CategoryJaeger2");
        jaeger1.setClassification("ClassificationJaeger2");
        jaeger1.setArmour(1);
        jaeger1.setHeight(22);
        jaeger1.setWeight(22);

        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getOrigin());
        System.out.println(jaeger1.getStreight());
        System.out.println(jaeger1.getCategory());
        System.out.println(jaeger1.getClassification());
        System.out.println(jaeger1.getArmour());
        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger1.getWeight());
    }
}