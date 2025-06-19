import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "E:/Papka1/books.json";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        // === Создание нового файла ===
        while (true) {
            System.out.print("Создать новый файл? (Y/N): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                book_list_create.create();  // Исправленный вызов
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Добавление книг ===
        while (true) {
            System.out.print("Желаете добавить книги? (Y/N): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                book_add adder = new book_add(FILE_PATH);  // Исправленный класс
                adder.addBooks();  // Исправленный метод
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Поиск книг ===
        while (true) {
            System.out.print("Хотите найти книгу? (Y/N): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                book_search searcher = new book_search(FILE_PATH);  // Исправленный класс
                searcher.searchBooks();  // Исправленный метод
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }

        // === Удаление книг ===
        while (true) {
            System.out.print("Хотите удалить книгу? (Y/N): ");
            choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Y")) {
                book_remove remover = new book_remove(FILE_PATH);
                remover.removeBookById();  // Исправленный метод
                break;
            } else if (choice.equalsIgnoreCase("N")) {
                break;
            } else {
                System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }
}