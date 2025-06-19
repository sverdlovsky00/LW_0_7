import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Cons;

        // === Создание нового файла ===
        while (true) {
            System.out.print("Создать новый файл? (Y/N): ");
            Cons = sc.nextLine();

            if (Cons.equalsIgnoreCase("Y")) {
                create_the_list.main(null); // вызываем другой класс
                break;
            } else if (Cons.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Добавление книг ===
        while (true) {
            System.out.print("Желаете добавить еще книги? (Y/N): ");
            Cons = sc.nextLine();

            if (Cons.equalsIgnoreCase("Y")) {
                new_books nb = new new_books("E:/Papka1/list_of_books.xml"); // путь к XML
                nb.add_books(); // вызов метода
                break;
            } else if (Cons.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Поиск книг ===
        while (true) {
            System.out.print("Хотите найти книгу? (Y/N): ");
            Cons = sc.nextLine();

            if (Cons.equalsIgnoreCase("Y")) {
                search sb = new search("E:/Papka1/list_of_books.xml"); // путь к XML
                sb.search_books(); // вызов метода
                break;
            } else if (Cons.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Удаление книг ===
        while (true) {
            System.out.print("Хотите удалить книгу? (Y/N): ");
            Cons = sc.nextLine();

            if (Cons.equalsIgnoreCase("Y")) {
                book_remove rb = new book_remove("E:/Papka1/list_of_books.xml"); // путь к XML
                rb.remove_books_ID(); // вызов метода
                break;
            } else if (Cons.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

    }
}