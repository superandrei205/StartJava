import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        while (true) {
            GuessNumber game = new GuessNumber(player1, player2);
            game.playGame();
            if (!createQuestionToContinue()) break;
        }
    }

    private static Player createPlayer(int count) {
        System.out.println("Введите имя " + count + " игрока");
        return new Player(scan.nextLine());
    }

    private static boolean createQuestionToContinue() {
        while (true) {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            String answer = scan.next();
            if ("yes".equals(answer)) {
                return true;
            } else if ("no".equals(answer)) {
                return false;
            }
        }
    }
}