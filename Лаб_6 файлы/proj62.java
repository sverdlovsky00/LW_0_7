package proj601;
public class proj62 {
	private static int num = 0;
	public static void display() {
		System.out.println("Текущее значение num: " + num);
		num++;}
	
	public static void main(String[]args) {
		for(int i=0; i<8; i++) {display();}
	}
}
