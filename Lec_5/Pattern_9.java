package Lec_5;

public class Pattern_9 {
	public static void main(String[] args) {
		int n = 5;
		int row=1;
		int nst = 1;
		int nsp = n-1;
		while(row<=n) {
//			Space
			for(int csp =1;csp<=nsp;csp=csp+1) {
				System.out.print("  ");
			}
			for(int cst=1;cst<=nst;cst=cst+1) {
				System.out.print("* ");
			}
			System.out.println();
			nsp=nsp-1;
			nst=nst+2;
			row=row+1;
		}
	}
}
