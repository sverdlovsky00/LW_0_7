import java.util.Scanner;

public class Timus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bishopPosition = scanner.next();
        String pawnPosition = scanner.next();

        // Преобразование позиций в координаты
        int bishopX = bishopPosition.charAt(0) - 'a';
        int bishopY = bishopPosition.charAt(1) - '1';
        int pawnX = pawnPosition.charAt(0) - 'a';
        int pawnY = pawnPosition.charAt(1) - '1';

        // Определение исхода партии
        if (bishopX == pawnX || bishopY == pawnY) {
            System.out.println("WHITE");
        } else {
            System.out.println("DRAW");
        }
    }
}