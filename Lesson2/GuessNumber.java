import java.util.Scanner;

public class GuessNumber {
    static Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private boolean toggle = true;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        setRandomNumber();
    }

    public void setRandomNumber() {
        this.randomNumber = 1 + (int) (Math.random() * 100);
    }

    public void playGame(Player player1, Player player2) {
        if (toggle) {
            inputNumber(player1);
            if (compareNumbers(player1)) {
                return;
            } else {
                playGame(player1, player2);
            }
        } else {
            inputNumber(player2);
            if (compareNumbers(player2)) {
                return;
            } else {
                playGame(player1, player2);
            }
        }
    }

    private void inputNumber(Player player) {
        System.out.println(player.getName() + " Введите ответ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == this.randomNumber) {
            System.out.println("Победил игрок с именем : " + player.getName());
            return true;
        } else {
            if (player.getNumber() > this.randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
            toggle = !toggle;
            return false;
        }
    }
}
