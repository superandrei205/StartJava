import java.util.Scanner;

public class GuessNumber {
    static Scanner scan = new Scanner(System.in);
    private int randomNumber;
    private boolean toggle;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        toggle = true;
        randomNumber = createRandomNumber();
        playGame(player1, player2);
        createQuestionToContinue(player1, player2);
    }

    private int createRandomNumber() {
        return 1 + (int) (Math.random() * 100);
    }

    private void playGame(Player player1, Player player2) {
        if (toggle) {
            giveAnswer(player1);
            if (checkAnswer(player1)) {
                return;
            } else {
                playGame(player1, player2);
            }
        } else {
            giveAnswer(player2);
            if (checkAnswer(player2)) {
                return;
            } else {
                playGame(player1, player2);
            }
        }
    }

    private void giveAnswer(Player player) {
        System.out.println(player.getName() + " Введите ответ");
        int answer = scan.nextInt();
        player.setAnswer(answer);
    }

    private boolean checkAnswer(Player player) {
        if (player.getAnswer() == randomNumber) {
            System.out.println("Победил игрок с именем : " + player.getName());
            return true;
        } else if (player.getAnswer() > randomNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            toggle = !toggle;
            return false;
        } else {
            System.out.println("Данное число меньше того, что загадал компьютер");
            toggle = !toggle;
            return false;
        }
    }

    private void createQuestionToContinue(Player player1, Player player2) {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        String answer = scan.next();
        if (answer.equals("yes")) {
            randomNumber = createRandomNumber();
            playGame(player1, player2);
            createQuestionToContinue(player1, player2);
        } else if (answer.equals("no")) {
            return;
        } else {
            createQuestionToContinue(player1, player2);
        }
    }
}
