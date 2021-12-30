package 娱乐;

public class Game {
    public static void main(String[] args) {
        Card card = new Card();
        for (int i = 0; i < 4; i++) {
            card.card();
            System.out.print("\t");
        }
    }
}
