import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "E:/Papka1/books.xlsx";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.print("Создать новый файл? (Y/N): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                book_list_create.create();
                break;
            } else if (choice.equalsIgnoreCase("N")) break;
            else System.out.println("Неверный ввод.");
        }

        while (true) {
            System.out.print("Добавить книги? (Y/N): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                book_add adder = new book_add(FILE_PATH);
                adder.addBooks();
                break;
            } else if (choice.equalsIgnoreCase("N")) break;
            else System.out.println("Неверный ввод.");
        }

        while (true) {
            System.out.print("Найти книгу? (Y/N): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                book_search searcher = new book_search(FILE_PATH);
                searcher.searchBooks();
                break;
            } else if (choice.equalsIgnoreCase("N")) break;
            else System.out.println("Неверный ввод.");
        }

        while (true) {
            System.out.print("Удалить книгу? (Y/N): ");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                book_remove remover = new book_remove(FILE_PATH);
                remover.removeBookById();
                break;
            } else if (choice.equalsIgnoreCase("N")) break;
            else System.out.println("Неверный ввод.");
        }
    }
}
