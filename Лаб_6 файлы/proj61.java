package proj601;
public class proj61 {
	private char charN;
	private String stringN;
	
	public proj61(){
		this.charN='\0';
		this.stringN=" ";
	}
	
	public void set(char a) {this.charN = a;}
	public void set(String b) {this.stringN = b;}
	public void set(char[]charmass) {
		if (charmass.length==1) {this.charN=charmass[0];}
		else {this.stringN = new String(charmass);}
	}
	
	public void display() {
		System.out.println("Символьный 0: "+charN+" Текстовый 0: "+stringN);
	}
	
	public static void main(String[]args) {
		proj61 object = new proj61();
		object.set('D');
		object.display();
		object.set("Cat");
		object.display();
		object.set(new char[]{'C','o','w'});
		object.display();
		object.set(new char[]{'I'});
		object.display();
	}
	}
