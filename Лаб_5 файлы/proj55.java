package proj501;
public class proj55 {
	private int number;
	public int getn() {return this.number;}
	public proj55() {
		this.number = 0;
	}
	public proj55(int number) {
		set(number);
	}
	public void set() {
		this.number=0;
	}
	public void set(int number) {
	 if (number > 100) {
		 this.number=100;}
	 else {this.number=number;}
	}
	
	
	public static void main (String[] args) {
		proj55 obj1 = new proj55();
		System.out.println("Значение метода без арументов: " + obj1.getn());
		proj55 obj2 = new proj55(20);
		System.out.println("Значение метода с аргументом 20: " + obj2.getn());
		proj55 obj3 = new proj55(110);
		System.out.println("Значение метода с аргументом 110: " + obj3.getn());
	}
}
