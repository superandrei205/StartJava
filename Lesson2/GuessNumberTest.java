import java.util.Scanner;

public class GuessNumberTest {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer(1);
        Player player2 = createPlayer(2);
        new GuessNumber(player1, player2);
    }

    private static Player createPlayer(int count) {
        String name;
        System.out.println("Введите имя " + count + " игрока");
        name = scan.nextLine();
        return new Player(name);
    }
}
