package proj501;
public class proj56 {
	private int min;
	private int max;
	
	public proj56() {
		 this.max = Integer.MIN_VALUE;
	     this.min = Integer.MAX_VALUE;}

	public proj56(int number) {
		setValues (number, number);}
	
	public proj56(int min, int max) {
		setValues (min,max);}
	
	public void setValues(int... values) {
		if (values.length == 2) {
			int value1 = values[0];
			int value2 = values[1];
		this.min = Math.min(value1, value2);
		this.max = Math.max(value1, value2);}
		else if (values.length == 1) {
			int value = values[0];
			this.min = value;
			this.max = value;}
		}
	public void display() {
		System.out.println("Минимальное число: " + min + "\nМаксимальное число: " + max);}
	public static void main(String[]args) {
		proj56 obj1 = new proj56();
		obj1.display();
		proj56 obj2 = new proj56(27);
		obj2.display();
		proj56 obj3 = new proj56(27,38);
		obj3.display();
		proj56 obj4 = new proj56(97,12);
		obj4.display();
	}
}
