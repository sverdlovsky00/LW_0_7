package proj601;
import java.util.Arrays;
public class proj67 {
	
	public static int[] char_mass_do(char[]char_mass) {
		int[]symb_mass = new int[char_mass.length];
		for (int i=0;i<char_mass.length;i++) {
			symb_mass[i]=(int)char_mass[i];}
		return symb_mass;}
	
	public static void main(String[] args) {
		char[]char_mass={'A', 'c','Z','t','E','f','R'};
		int[]symb_mass = char_mass_do(char_mass);
		System.out.println("Массив символов: "+Arrays.toString(char_mass));
		System.out.println("Массив кодов символов: "+Arrays.toString(symb_mass));
	}
}
