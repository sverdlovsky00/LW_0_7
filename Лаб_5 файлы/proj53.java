package proj501;
public class proj53 {
	private int num1;
	private int num2;
	
	public proj53() {
		this.num1 = 0;
		this.num2 = 0;
	    }
	public proj53(int num1) {
		this.num1 = num1;
		this.num2 = 0;
		}
	public proj53(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void disp() {
		System.out.println("Число 1: " + num1 + ", число 2: " + num2);
	}
	
	public static void main(String[]args) {
		proj53 const1 = new proj53();
		const1.disp();
		proj53 const2 = new proj53(2);
		const2.disp();
		proj53 const3 = new proj53(4,8);
		const3.disp();
		}
}
