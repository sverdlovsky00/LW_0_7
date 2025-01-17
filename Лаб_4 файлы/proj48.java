package proj401;
import java.util.Scanner;
public class proj48 {
    public static String encrypt(String text, int shift) {
    	StringBuilder encryptedText = new StringBuilder();
    	for (int i = 0; i < text.length(); i++) {
    		char ch = text.charAt(i);
    		ch = (char) (((int) ch + shift) % 256);
    		encryptedText.append(ch);
        }
        return encryptedText.toString();
    }
    public static String decrypt(String text, int shift) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch = (char) (((int) ch - shift + 256) % 256);
            decryptedText.append(ch);
        }
        
        return decryptedText.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ для шифрования (целое число): ");
        int shift = in.nextInt();
        in.nextLine();

        String encryptedText = encrypt(text, shift);
        System.out.println("Текст после преобразования: " + encryptedText);
        System.out.print("Выполнить обратное преобразование? (y/n): ");
        boolean ant=false;
        do{
        char user = in.next().charAt(0);
        if (user=='y') {
            String decryptedText = decrypt(encryptedText, shift);
            System.out.println("Расшифрованный текст: " + decryptedText);	ant=true;;
        } 
        else if (user=='n') {
            System.out.println("До свидания!");	ant=true;
        }
        else{
            System.out.println("Введите корректный ответ");	ant=false;
        }}        while (ant==false);
        
        in.close();
    }
}