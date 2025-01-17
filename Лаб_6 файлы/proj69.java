package proj601;
import java.util.Arrays;
public class proj69 {
	
	public static char[] swap_char_mass(char[]mass) {
		int numl=0; int numr=mass.length-1;
		while (numl<numr) {
			char tmp = mass[numl];
			mass[numl] = mass[numr];
			mass[numr] = tmp;
			numl++; numr--;
		}
	return mass;
	}
	
	public static void main(String[]args) {
		char[]chars_mass = {'A', 'c','Z','t','E','f','R'};
		System.out.println("Первоначальный массив символов: "+Arrays.toString(chars_mass));
		chars_mass=swap_char_mass(chars_mass);
		System.out.println("Массив символов после преобразования: "+Arrays.toString(chars_mass));		
	}
}
