package proj501;
public class proj52 {
	private char char1;
	private char char2;
	public void set (char char1, char char2) {
		this.char1=char1;
		this.char2=char2;		
	}
	public void display() {
		for (int i=char1; i<=char2; i++) {
			System.out.print((char) i+" ");
		}
		System.out.print("\n");
	}
	public static void main(String[]args) {
		proj52 charout=new proj52();
		charout.set('A','D');
		charout.display();
		}
}
