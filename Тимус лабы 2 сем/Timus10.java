import java.math.BigDecimal;
import java.util.Scanner;

public class Timus10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();

        BigDecimal x = BigDecimal.ZERO;
        BigDecimal y = BigDecimal.ZERO;

        for (char c : commands.toCharArray()) {
            switch(c) {
                case '8': // Север (+Y)
                    y = y.add(BigDecimal.ONE);
                    break;
                case '2': // Юг (-Y)
                    y = y.subtract(BigDecimal.ONE);
                    break;
                case '6': // Восток (+X)
                    x = x.add(BigDecimal.ONE);
                    break;
                case '4': // Запад (-X)
                    x = x.subtract(BigDecimal.ONE);
                    break;
                case '7': // Северо-Запад (+Y, -X)
                    y = y.add(BigDecimal.ONE);
                    x = x.subtract(BigDecimal.ONE);
                    break;
                case '9': // Северо-Восток (+Y, +X)
                    y = y.add(BigDecimal.ONE);
                    x = x.add(BigDecimal.ONE);
                    break;
                case '1': // Юго-Запад (-Y, -X)
                    y = y.subtract(BigDecimal.ONE);
                    x = x.subtract(BigDecimal.ONE);
                    break;
                case '3': // Юго-Восток (-Y, +X)
                    y = y.subtract(BigDecimal.ONE);
                    x = x.add(BigDecimal.ONE);
                    break;
                case '0': // Самоубийство, завершение маршрута
                    break;
                default: // Остальные символы пропускаются
                    continue;
            }

            if (c == '0') { // Фиксируем точку уничтожения
                break;
            }
        }

        System.out.println(x.setScale(10, BigDecimal.ROUND_HALF_UP).stripTrailingZeros() + " " +
                y.setScale(10, BigDecimal.ROUND_HALF_UP).stripTrailingZeros());
    }
}