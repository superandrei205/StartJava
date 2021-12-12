public class Variable {
    public static void main(String[] args) {
        byte amountOfUsers = 1;
        short CPU = 2_400;
        int memory = 8_000_000;
        long varTypeLong = 700_000_000;
        float graphics = 1.5f;
        double frequency = 2.3;
        char varTypeChar = 'A';
        boolean isMacIos = true;
        System.out.println("Количество пользователей : " + amountOfUsers);
        System.out.println("Процессор : " + CPU + "Hz");
        System.out.println("Память : " + memory + "Мб");
        System.out.println("Переменная типа long : " + varTypeLong);
        System.out.println("Графика : " + graphics + "Мб");
        System.out.println("Частота : " + frequency + "Hz");
        System.out.println("Переменная типа char : " + varTypeChar);
        System.out.println("Владелец Андрей Ремизов : " + isMacIos);
    }
}
