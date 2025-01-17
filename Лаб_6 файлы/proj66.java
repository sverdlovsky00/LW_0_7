package proj601;
import java.util.Arrays;
public class proj66 {
	
	public static int[] nmass(int[] mass, int num) {
		if (num >= mass.length) {return Arrays.copyOf(mass, mass.length);}
		return Arrays.copyOfRange(mass, 0, num);}
	
		public static void main(String[] args) {
			int[] old_mass = {1, 2, 3, 4, 5, 6, 7};
			int[] nmass1 = nmass(old_mass, 5);
			System.out.println("Результат (5 элементов): "+Arrays.toString(nmass1));
			int[] nmass2 = nmass(old_mass, 10);
			System.out.println("Результат (9 элементов): "+Arrays.toString(nmass2));
	    }
}
