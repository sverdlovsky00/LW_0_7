package proj601;
public class proj63 {
	public static int Vmin(int... nums) {
		int min = Integer.MAX_VALUE;
		for (int num : nums){
			if (num<min) {min=num;}
		}
	return min;
	}
	public static int Vmax(int... nums) {
		int max = Integer.MIN_VALUE;
		for (int num : nums){
			if (num>max) {max=num;}
		}
	return max;
	}
	public static double mid(int...nums) {
		int Snums = 0;
		for (int num:nums) {Snums=Snums+num;}
		return (double) Snums/nums.length;
	}
	
	public static void main(String[]args) {
		System.out.println("Определены числа: 1,5,9,4,17,9,24");
		System.out.println("Минимальное значение среди чисел: " + Vmin(1,5,9,4,17,9,24));
		System.out.println("Максимальное значение среди чисел: " + Vmax(1,5,9,4,17,9,24));
		System.out.println("Среднее значение среди чисел: " + mid(1,5,9,4,17,9,24));
	}
}
