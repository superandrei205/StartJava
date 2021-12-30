import java.util.Scanner;

public class GuessNumber {
    static Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = 1 + (int) (Math.random() * 100);
    }

    public void play() {
        Player currentPlayer = player1;
        while (true) {
            inputNumber(currentPlayer);
            if (compareNumbers(currentPlayer)) {
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " Введите ответ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Победил игрок с именем : " + player.getName());
            return true;
        }
        if (player.getNumber() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }
}