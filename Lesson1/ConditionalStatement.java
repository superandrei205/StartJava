public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 1;

        if (age < 20) {
            System.out.println("Моложе 20 лет");
        }

        boolean isMale = true;

        if (isMale) {
            System.out.println("Мужчина");
        }

        if (!isMale) {
            System.out.println("Женщина");
        }

        double height = 1.90;

        if (height < 1.80) {
            System.out.println("Ниже 180 см");
        } else {
            System.out.println("Выше 180 см");
        }

        char firstNameLetter = 'M';

        if (firstNameLetter == 'M') {
            System.out.println("Первая буква М");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква I");
        } else {
            System.out.println("Первая буква не М и не I");
        }
    }
}
