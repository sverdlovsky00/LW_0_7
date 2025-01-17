package proj601;
import java.util.Scanner;

public class proj65 {
	public static int with_no_rec(int num) {
		int Snum=0;
		for (int i=1; i<=num; i++) {Snum=Snum+(i*i);}
        return Snum;}
	
	public static int with_rec(int num) {
		if (num == 1) {return 1;}
		return num*num+with_rec(num-1);}

	public static int check(int num){
		return (num*(num+1)*(2*num+1))/6;}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int vnum = in.nextInt();
        if (vnum <= 0) {System.out.println("Число должно быть натуральным!");} 
        	else {System.out.println("Для числа "+vnum+" сумма квадратов без рекурсии равена "+with_no_rec(vnum));
        	System.out.println("Для числа "+vnum+" сумма квадратов с рекурсией равена "+with_rec(vnum));
        	System.out.println("Проверка результата: "+vnum+": "+check(vnum));}
        in.close();}
	}