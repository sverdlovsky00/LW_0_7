package proj501;
public class proj51 {
	private char lit;
	public void setlit(char lit) {
		this.lit = lit;
	}
	public int getcode()	{
		return (int) lit;}
		public void display() {
		System.out.println("Символу "+lit+ " пренадлежит код " + (int)lit);
	}
	public static void main(String[]args) {
		proj51 litinfo = new proj51();
		litinfo.setlit('Z');
		litinfo.display();
		int code = litinfo.getcode();
		System.out.println("Код символа: "+code);
			
	}
}
