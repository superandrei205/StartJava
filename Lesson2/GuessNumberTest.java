import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        GuessNumber game = new GuessNumber(player1, player2);
        game.playGame(player1,player2);
        createQuestionToContinue(player1, player2, game);
    }

    private static Player createPlayer(int count) {
        System.out.println("Введите имя " + count + " игрока");
        return new Player(scan.nextLine());
    }

    private static void createQuestionToContinue(Player player1, Player player2, GuessNumber game) {
        System.out.println("Хотите продолжить игру? [yes/no]:");
        String answer = scan.next();
        if (answer.equals("yes")) {
            game.playGame(player1, player2);
            createQuestionToContinue(player1, player2, game);
        } else if (answer.equals("no")) {
            return;
        } else {
            createQuestionToContinue(player1, player2, game);
        }
    }
}
