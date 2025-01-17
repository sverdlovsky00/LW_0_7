package proj601;
import java.util.Scanner;
public class proj64 {
    public static int with_no_rec(int num) {
    	int fact=1;
        if (num == 0) {return 1;}
        for (int i = num; i > 0; i=i-2) {
            fact=fact*i;}
        return fact;}
    
    public static int with_rec(int num) {
        if (num <= 0) {return 1;}
        return num * with_rec(num - 2);}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int vnum = in.nextInt();
        if (vnum < 0) {System.out.println("Число должно быть положительным!");} 
        	else {
            System.out.println("Для числа " + vnum + " двойной факториал без рекурсии равен " + with_no_rec(vnum));
            System.out.println("Для числа " + vnum + " двойной факториал с рекурсией равен " + with_rec(vnum));}
        in.close();
    }
}
