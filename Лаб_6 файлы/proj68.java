package proj601;
import java.util.Arrays;
public class proj68 {
	
	public static double int_avr(int[]int_mass) {
		if (int_mass.length==0) {return 0;}
		int snum=0;
		for (int num : int_mass) {snum=snum+num;}
		return (double)snum/int_mass.length;}
	
	public static void main(String[] args) {
		int[]int_mass= {8,5,10,4,27,88,1,69,2};
		System.out.print("Для массива чисел "+Arrays.toString(int_mass));
		System.out.print(" средним числом является: "+int_avr(int_mass));
	}
}
