package proj401;
public class proj4777 {
	public static void main(String[] args) {
		int[][]mass = new int[10][10];
		int mn = 0; 
		int nl = 0;
		int h = 0; 
			for (int i = 0; h < mass.length ; h++) {
				for (int j = 0; j <(mass[i].length - mn); j++) {
					mass[i][j] = nl;
					nl++;
				}
				if(i<mass.length-1) {i++;}
				for (int n=9; n>mn; n--) { 
	                mass[n][mass[i].length-1-mn] = nl;
					nl++;
				}
				mn++;
			}
			for (int i=0; i<10; i++){
				for (int j=0; j<10; j++){
					System.out.print(" "+mass[i][j]);
					}
				System.out.print("\n");
			}
	    }
}
