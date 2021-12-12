public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 1;
        boolean isMale = true;
        double height = 1.90;
        char firstNameLetter = 'M';


        if (age < 20) {
            System.out.println("Моложе 20 лет");
        }

        if (isMale) {
            System.out.println("Мужчина");
        }

        if (!isMale) {
            System.out.println("Женщина");
        }

        if (height < 1.80) {
            System.out.println("Ниже 180 см");
        } else {
            System.out.println("Выше 180 см");
        }

        if (firstNameLetter == 'M') {
            System.out.println("Первая буква М");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква I");
        } else {
            System.out.println("Первая буква не М и не I");
        }
    }
}
