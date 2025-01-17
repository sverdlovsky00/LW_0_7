package proj501;
public class proj54 {
	private char chary;
	private int number;
	public proj54(int num, char ch) {
		this.number = num;
		this.chary = ch;}
			
	public proj54 (double dnum) {
		this.chary = (char)((int)dnum);
		double dnum100 = dnum - (int)dnum;
		this.number = (int) Math.round(dnum100*100);}
		
	public void display() {
		System.out.println("Символ: "+chary+", число: "+number);
		}
	
	public static void main(String[]args) {
		proj54 obj1 = new proj54(65,'A');
		obj1.display();
		
		proj54 obj2 = new proj54(65.1267);
		obj2.display();
	}

}
